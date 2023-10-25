import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IU(miViewModel: MyViewModel) {

    val (buttonText, setButtonText) = remember { mutableStateOf("Start") }


    Column {
        Text(
            text = "ROUND",
            fontSize = 24.sp,
            modifier = Modifier.align(Alignment.End)
        )
        Modifier.padding(18.dp)
        if (miViewModel.round > 9) {
            Text(
                text = miViewModel.round.toString(),
                fontSize = 36.sp,
                modifier = Modifier.align(Alignment.End)
            )
        } else {
            Text(
                text = miViewModel.round.toString(),
                fontSize = 24.sp,
                modifier = Modifier.align(Alignment.End)
            )
        }



        Column(modifier = Modifier.padding(60.dp)) {


            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(20.dp)){
                Button(
                    onClick = { Log.d("Tag", "Blue button") },
                    modifier = Modifier
                        .size(120.dp)
                        .background(Color.Blue)
                        .padding(15.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent,
                        contentColor = Color.White
                    )
                ) {
                    Text("")
                }

                Button(
                    onClick = { Log.d("Tag", "Green button") },
                    modifier = Modifier
                        .size(120.dp)
                        .background(Color.Green)
                        .padding(15.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent,
                        contentColor = Color.White
                    )
                ) {
                    Text("")
                }

            }

            Spacer(modifier = Modifier.height(20.dp))

            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(20.dp)){
                Button(
                    onClick = { Log.d("Tag", "Red button") },
                    modifier = Modifier
                        .size(120.dp)
                        .background(Color.Red)
                        .padding(15.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent,
                        contentColor = Color.White
                    )
                ) {
                    Text("")
                }

                Button(
                    onClick = { Log.d("Tag", "Yellow button") },
                    modifier = Modifier
                        .size(120.dp)
                        .background(Color.Yellow)
                        .padding(15.dp),

                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent,
                        contentColor = Color.White
                    )
                ) {
                    Text("")
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Row {
                Button(
                    onClick = { setButtonText("Reset") },
                    modifier = Modifier
                        .padding(50.dp)
                ) {
                    Text(
                        text = buttonText,
                        fontSize = 16.sp,
                        color = Color.White
                    )
                }

                Button(
                    onClick = {
                              miViewModel.anotherRound()
                    },
                    modifier = Modifier.padding(10.dp)
                ) {
                    Text(
                        text = "->",
                        fontSize = 16.sp,
                        color = Color.White
                    )
                }
            }

        }
    }
}
























