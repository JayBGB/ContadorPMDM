import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dam.contador.R
import com.dam.contador.MyViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IU(miViewModel: MyViewModel) {


    Column {

        if ( miViewModel.namee.length > 3) {
            Text(
                text = "Name: ${ miViewModel.namee}!",
                fontSize = 24.sp,

                )
            Modifier.padding(18.dp)
        }
        OutlinedTextField(
            value = miViewModel.namee,
            onValueChange = {
                miViewModel.namee = it
            },
            label = { Text(text = "Name") }
        )



    }

    Column {
        Text(
            text = "Random number: ${miViewModel.getNumero()}"+"\n Number list: ${miViewModel.getLista()}" ,
            modifier = Modifier.padding(100.dp),
            color = Color.DarkGray
        )
        Button(
            onClick = {
               miViewModel.funcionRandom()
                Log.d("Tag", "OnClick")
            },
            modifier = Modifier.padding(64.dp)

        )
        {
            Image(
                painter = painterResource(id = R.drawable.tesla_motors),

                contentDescription = "Generate numbers",
                Modifier.padding(8.dp)

            )
        }
    }

}






















