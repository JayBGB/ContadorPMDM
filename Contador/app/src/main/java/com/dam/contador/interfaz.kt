import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dam.contador.AppData
import com.dam.contador.R
import com.dam.contador.MyViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IU(viewModel: MyViewModel) {
    val appData = remember { mutableStateOf(AppData()) }

    Column {
        if (appData.value.name.length > 3) {
            Text(
                text = "Name: ${appData.value.name}!",
                fontSize = 24.sp,
                modifier = Modifier.padding(18.dp)
            )
        }
        OutlinedTextField(
            value = appData.value.name,
            onValueChange = { newName ->
                viewModel.updateName(newName)
                appData.value = appData.value.copy(name = newName)
            },
            label = { Text(text = "Name") }
        )
    }

    Column {
        Text(
            text = "Random number: ${appData.value.num}\nNumber list: ${viewModel.getLista()}",
            modifier = Modifier.padding(100.dp),
            color = Color.DarkGray
        )
        Button(
            onClick = {
                viewModel.funcionRandom()
                appData.value = appData.value.copy(num = viewModel.getNumero())
            },
            modifier = Modifier.padding(64.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.tesla_motors),
                contentDescription = "Generate numbers",
                Modifier.padding(8.dp)
            )
        }
    }
}



















