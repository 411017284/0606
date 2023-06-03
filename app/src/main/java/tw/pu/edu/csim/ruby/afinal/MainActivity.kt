package tw.pu.edu.csim.ruby.afinal

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import tw.pu.edu.csim.ruby.afinal.ui.theme.FinalTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeScreen()
            FinalTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun MyComposeScreen() {
    Text(text = "Hello, Jetpack Compose!")
}

@Composable
fun Greeting(name: String) {
    val navController = rememberNavController()
    val context = LocalContext.current
    val showMenu = remember { mutableStateOf(false) }
    var Animals = arrayListOf(R.drawable.game)


    Column {
        TopAppBar(
            title = { Text(text = "It's game time!") },
            navigationIcon = {
                IconButton(onClick = {
                    Toast.makeText(context, "您點選了導覽圖示", Toast.LENGTH_SHORT).show()
                }) {
                    Icon(Icons.Default.Menu, contentDescription = "Navigation icon")
                }
            },
            actions = {
                IconButton(
                    onClick = { Toast.makeText(context, "作者：資管二A 第六組 \n 陳柔涵 王思婷 陳咨穎 陳怡嘉", Toast.LENGTH_SHORT).show() }
                ) {
                    Icon(Icons.Rounded.AccountBox, contentDescription = "author")
                }

                IconButton(
                    onClick = { showMenu.value = true }
                ) {
                    Icon(Icons.Default.MoreVert, contentDescription = null)
                }
                DropdownMenu(
                    expanded = showMenu.value, onDismissRequest = { showMenu.value = false }
                ) {
                    DropdownMenuItem(
                        onClick = {
                            navController.navigate("JumpFirst")
                        })
                    {
                        Text(text = "畫面1")
                    }
                    DropdownMenuItem(
                        onClick =
                        {
                            navController.navigate("JumpSecond")
                        })
                    {
                        Text(text = "畫面2")
                    }
                }
            }
        )
        NavHost(navController = navController, startDestination = "JumpFirst") {
            composable("JumpFirst") {
                FirstScreen(navController = navController)
            }
            composable("JumpSecond") {
                SecondScreen(navController = navController)
            }
            composable("JumpThird") {
                ThirdScreen(navController = navController)
            }
            composable("JumpForth") {
                ForthScreen(navController = navController)
            }
            composable("JumpFifth") {
                FifthScreen(navController = navController)
            }
            composable("JumpSix") {
                SixScreen(navController = navController)
            }
            composable("JumpSeven") {
                SevenScreen(navController = navController)
            }
            composable("JumpEight") {
                EightScreen(navController = navController)
            }
            composable("JumpNine") {
                NineScreen(navController = navController)
            }
            composable("JumpTen") {
                TenScreen(navController = navController)
            }
            composable("JumpEleven") {
                ElevenScreen(navController = navController)
            }
            composable("JumpTwelve") {
                TwelveScreen(navController = navController)
            }
            composable("JumpThirteen") {
                ThirteenScreen(navController = navController)
            }
        }
    }
}




    @Composable
    fun FirstScreen(navController: NavController) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.LightGray),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.game),
                contentDescription = ""
            )
            Spacer(modifier = Modifier.height(42.dp))

            Row()
            {
                Button(onClick = {
                    navController.navigate("JumpSecond")
                },
                    colors = ButtonDefaults.buttonColors
                        (backgroundColor = androidx.compose.ui.graphics.Color.DarkGray),
                    shape = RoundedCornerShape(20.dp)
                ) {
                    Text(text = "南社社區介紹", color = androidx.compose.ui.graphics.Color.Green)
                }
                Spacer(modifier = Modifier.width(16.dp))
                Button(onClick = {
                    navController.navigate("JumpThird")
                },
                    colors = ButtonDefaults.buttonColors
                        (backgroundColor = androidx.compose.ui.graphics.Color.DarkGray),
                    shape = RoundedCornerShape(20.dp))
                {
                    Text(text = "瑪利亞基金會", color = androidx.compose.ui.graphics.Color.Green)
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Row() {
                Button(onClick = {
                    navController.navigate("JumpForth")
                }) {
                    Text(text = "國旗篇")
                }
                Spacer(modifier = Modifier.width(16.dp))

                Button(onClick = {
                    navController.navigate("JumpNine")
                }) {
                    Text(text = "動物篇")
                }

                Spacer(modifier = Modifier.width(16.dp))

                Button(onClick = {
                    navController.navigate("JumpSix")
                }) {
                    Text(text = "好笑的")
                }
            }
        }
    }



@Composable
    fun SecondScreen(navController: NavController) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.LightGray)
                .wrapContentHeight(align = Alignment.Top),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "南社社區介紹",fontSize = 40.sp)
            Image(
                painter = painterResource(id = R.drawable.us),
                contentDescription = ""
            )
        }

        Column(modifier = Modifier
            .fillMaxSize()
            .wrapContentWidth(align = Alignment.Start),
                verticalArrangement = Arrangement.Center,)
        {
            Spacer(modifier = Modifier.height(70.dp))
            Text(text = "1.地址:臺中市清水區南社里中華路171號",textAlign = TextAlign.Start,fontSize = 18.sp)
            Text(text = "\n"+"2.電話:0928-990-850"+"\n",textAlign = TextAlign.Start,fontSize = 18.sp)
            Text(text = "3.開放時間:每週二、三"+"\n"+"   上午08：30~11：30" + "\n"+"   下午13:30-16:30"+"\n"+"   周一(南社東福德祠)、四(牛埔仔福德祠)"+"\n",fontSize = 18.sp, textAlign = TextAlign.Start)
            Text(text = "4.服務範圍:南社里、槺榔里、清水里",fontSize = 18.sp, textAlign = TextAlign.Start)
        }
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.BottomCenter
        ) {
            Row(
                modifier = Modifier.padding(16.dp)
            ) {
                Button(onClick = {
                    navController.navigate("JumpFirst")
                }) {
                    Text(text = "回首頁")
                }
            }
        }
    }
@Composable
fun ThirdScreen(navController: NavController) {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
            .wrapContentHeight(align = Alignment.Top),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
                Toast.makeText(context, "愛心家園", Toast.LENGTH_SHORT).show()
            },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Yellow
            ),
            shape = RoundedCornerShape(20.dp)
        ) {
            Text(text = "瑪利亞基金會",fontSize = 30.sp, color = Color.Black)
        }
        Spacer(modifier = Modifier.height(20.dp))
        Image(
            painter = painterResource(id = R.drawable.maria),
            contentDescription = ""
        )
    }

    Column(modifier = Modifier
        .fillMaxSize()
        .wrapContentWidth(align = Alignment.Start),
        verticalArrangement = Arrangement.Center,)
    {
        Spacer(modifier = Modifier.height(70.dp))
        Text(text = "1.地址:台中市南屯區東興路一段450號",textAlign = TextAlign.Start,fontSize = 18.sp)
        Text(text = "\n"+"2.電話:04-24713535"+"\n",textAlign = TextAlign.Start,fontSize = 18.sp)
        Text(text = "3.開放時間:平日 08:00~20:50"+"\n"+"   假日 08:00~17:00" + "\n",fontSize = 18.sp, textAlign = TextAlign.Start)
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ) {
        Row(
            modifier = Modifier.padding(16.dp)
        ) {
            Button(onClick = {
                navController.navigate("JumpFirst")
            }) {
                Text(text = "回首頁")
            }
        }
    }
}

@Composable
fun ForthScreen(navController: NavController) {
    val swedenImageResourceId = remember { mutableStateOf<Int?>(null) }
    val ukImageResourceId = remember { mutableStateOf<Int?>(null) }
    val twImageResourceId = remember { mutableStateOf<Int?>(null) }
    val chImageResourceId = remember { mutableStateOf<Int?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentHeight(align = Alignment.Top),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "猜猜是哪個國家的國旗",fontSize = 36.sp)
        Image(
            painter = painterResource(id = R.drawable.sweden),
            contentDescription = ""
        )
    }

    Column(modifier = Modifier
        .fillMaxSize()
        .wrapContentWidth(align = Alignment.Start),
        verticalArrangement = Arrangement.Center,)
    {
        Spacer(modifier = Modifier.height(70.dp))
        if (swedenImageResourceId.value != null) {
            Image(
                painter = painterResource(id = swedenImageResourceId.value!!),
                contentDescription = "圖片"
            )
        } else {
            Button(
                onClick = {
                    swedenImageResourceId.value = R.drawable.circle
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.DarkGray
                ),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text(text = "瑞典", color = Color.Green)
            }
        }


        if (ukImageResourceId.value != null) {
            Image(
                painter = painterResource(id = ukImageResourceId.value!!),
                contentDescription = "圖片"
            )
        } else {
            Button(
                onClick = {
                    ukImageResourceId.value = R.drawable.nono
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.DarkGray
                ),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text(text = "英國", color = Color.Green)
            }
        }

        if (twImageResourceId.value != null) {
            Image(
                painter = painterResource(id = twImageResourceId.value!!),
                contentDescription = "圖片"
            )
        } else {
            Button(
                onClick = {
                    twImageResourceId.value = R.drawable.nono
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.DarkGray
                ),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text(text = "台灣", color = Color.Green)
            }
        }

        if (chImageResourceId.value != null) {
            Image(
                painter = painterResource(id = chImageResourceId.value!!),
                contentDescription = "圖片"
            )
        } else {
            Button(
                onClick = {
                    chImageResourceId.value = R.drawable.nono
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.DarkGray
                ),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text(text = "中國", color = Color.Green)
            }
        }

    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ) {
        Row(
            modifier = Modifier.padding(16.dp)
        ) {
            Button(onClick = {
                navController.navigate("JumpFirst")
            }) {
                Text(text = "回首頁")
            }
            Spacer(modifier = Modifier.width(100.dp))
            Button(onClick = {
                navController.navigate("JumpFifth")
            }) {
                Text(text = "下一頁")
            }
        }
    }
}

@Composable
fun FifthScreen(navController: NavController) {
    val swedenImageResourceId = remember { mutableStateOf<Int?>(null) }
    val ukImageResourceId = remember { mutableStateOf<Int?>(null) }
    val twImageResourceId = remember { mutableStateOf<Int?>(null) }
    val chImageResourceId = remember { mutableStateOf<Int?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentHeight(align = Alignment.Top),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "猜猜是哪個國家的國旗",fontSize = 36.sp)
        Image(
            painter = painterResource(id = R.drawable.france),
            contentDescription = ""
        )
    }

    Column(modifier = Modifier
        .fillMaxSize()
        .wrapContentWidth(align = Alignment.Start),
        verticalArrangement = Arrangement.Center,)
    {
        Spacer(modifier = Modifier.height(70.dp))
        if (swedenImageResourceId.value != null) {
            Image(
                painter = painterResource(id = swedenImageResourceId.value!!),
                contentDescription = "圖片"
            )
        } else {
            Button(
                onClick = {
                    swedenImageResourceId.value = R.drawable.nono
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.DarkGray
                ),
                shape = RoundedCornerShape(80.dp)
            ) {
                Text(text = "俄羅斯", color = Color.Green)
            }
        }


        if (ukImageResourceId.value != null) {
            Image(
                painter = painterResource(id = ukImageResourceId.value!!),
                contentDescription = "圖片"
            )
        } else {
            Button(
                onClick = {
                    ukImageResourceId.value = R.drawable.circle
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.DarkGray
                ),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text(text = "法國", color = Color.Green)
            }
        }

        if (twImageResourceId.value != null) {
            Image(
                painter = painterResource(id = twImageResourceId.value!!),
                contentDescription = "圖片"
            )
        } else {
            Button(
                onClick = {
                    twImageResourceId.value = R.drawable.nono
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.DarkGray
                ),
                shape = RoundedCornerShape(60.dp)
            ) {
                Text(text = "義大利", color = Color.Green)
            }
        }

        if (chImageResourceId.value != null) {
            Image(
                painter = painterResource(id = chImageResourceId.value!!),
                contentDescription = "圖片"
            )
        } else {
            Button(
                onClick = {
                    chImageResourceId.value = R.drawable.nono
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.DarkGray
                ),
                shape = RoundedCornerShape(60.dp)
            ) {
                Text(text = "西班牙", color = Color.Green)
            }
        }

    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ) {
        Row(
            modifier = Modifier.padding(16.dp)
        ) {
            Button(onClick = {
                navController.navigate("JumpForth")
            }) {
                Text(text = "上一頁")
            }
            Spacer(modifier = Modifier.width(100.dp))

            Button(onClick = {
                navController.navigate("JumpSix")
            }) {
                Text(text = "下一頁")
            }
        }
    }
}

@Composable
fun SixScreen(navController: NavController) {
    val swedenImageResourceId = remember { mutableStateOf<Int?>(null) }
    val ukImageResourceId = remember { mutableStateOf<Int?>(null) }
    val twImageResourceId = remember { mutableStateOf<Int?>(null) }
    val chImageResourceId = remember { mutableStateOf<Int?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentHeight(align = Alignment.Top),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "猜猜是哪個國家的國旗",fontSize = 36.sp)
        Image(
            painter = painterResource(id = R.drawable.paraguay),
            contentDescription = ""
        )
    }

    Column(modifier = Modifier
        .fillMaxSize()
        .wrapContentWidth(align = Alignment.Start),
        verticalArrangement = Arrangement.Center,)
    {
        Spacer(modifier = Modifier.height(70.dp))
        if (swedenImageResourceId.value != null) {
            Image(
                painter = painterResource(id = swedenImageResourceId.value!!),
                contentDescription = "圖片"
            )
        } else {
            Button(
                onClick = {
                    swedenImageResourceId.value = R.drawable.nono
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.DarkGray
                ),
                shape = RoundedCornerShape(80.dp)
            ) {
                Text(text = "烏克蘭", color = Color.Green)
            }
        }


        if (ukImageResourceId.value != null) {
            Image(
                painter = painterResource(id = ukImageResourceId.value!!),
                contentDescription = "圖片"
            )
        } else {
            Button(
                onClick = {
                    ukImageResourceId.value = R.drawable.nono
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.DarkGray
                ),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text(text = "土耳其", color = Color.Green)
            }
        }

        if (twImageResourceId.value != null) {
            Image(
                painter = painterResource(id = twImageResourceId.value!!),
                contentDescription = "圖片"
            )
        } else {
            Button(
                onClick = {
                    twImageResourceId.value = R.drawable.circle
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.DarkGray
                ),
                shape = RoundedCornerShape(60.dp)
            ) {
                Text(text = "巴拉圭", color = Color.Green)
            }
        }

        if (chImageResourceId.value != null) {
            Image(
                painter = painterResource(id = chImageResourceId.value!!),
                contentDescription = "圖片"
            )
        } else {
            Button(
                onClick = {
                    chImageResourceId.value = R.drawable.nono
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.DarkGray
                ),
                shape = RoundedCornerShape(60.dp)
            ) {
                Text(text = "韓國", color = Color.Green)
            }
        }

    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ) {
        Row(
            modifier = Modifier.padding(16.dp)
        ) {
            Button(onClick = {
                navController.navigate("JumpFifth")
            }) {
                Text(text = "上一頁")
            }
            Spacer(modifier = Modifier.width(100.dp))

            Button(onClick = {
                navController.navigate("JumpSeven")
            }) {
                Text(text = "下一頁")
            }
        }
    }
}

@Composable
fun SevenScreen(navController: NavController) {
    val swedenImageResourceId = remember { mutableStateOf<Int?>(null) }
    val ukImageResourceId = remember { mutableStateOf<Int?>(null) }
    val twImageResourceId = remember { mutableStateOf<Int?>(null) }
    val chImageResourceId = remember { mutableStateOf<Int?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentHeight(align = Alignment.Top),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "猜猜是哪個國家的國旗",fontSize = 36.sp)
        Image(
            painter = painterResource(id = R.drawable.finland),
            contentDescription = ""
        )
    }

    Column(modifier = Modifier
        .fillMaxSize()
        .wrapContentWidth(align = Alignment.Start),
        verticalArrangement = Arrangement.Center,)
    {
        Spacer(modifier = Modifier.height(70.dp))
        if (swedenImageResourceId.value != null) {
            Image(
                painter = painterResource(id = swedenImageResourceId.value!!),
                contentDescription = "圖片"
            )
        } else {
            Button(
                onClick = {
                    swedenImageResourceId.value = R.drawable.nono
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.DarkGray
                ),
                shape = RoundedCornerShape(80.dp)
            ) {
                Text(text = "冰島", color = Color.Green)
            }
        }


        if (ukImageResourceId.value != null) {
            Image(
                painter = painterResource(id = ukImageResourceId.value!!),
                contentDescription = "圖片"
            )
        } else {
            Button(
                onClick = {
                    ukImageResourceId.value = R.drawable.nono
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.DarkGray
                ),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text(text = "馬爾地夫", color = Color.Green)
            }
        }

        if (twImageResourceId.value != null) {
            Image(
                painter = painterResource(id = twImageResourceId.value!!),
                contentDescription = "圖片"
            )
        } else {
            Button(
                onClick = {
                    twImageResourceId.value = R.drawable.circle
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.DarkGray
                ),
                shape = RoundedCornerShape(60.dp)
            ) {
                Text(text = "芬蘭", color = Color.Green)
            }
        }

        if (chImageResourceId.value != null) {
            Image(
                painter = painterResource(id = chImageResourceId.value!!),
                contentDescription = "圖片"
            )
        } else {
            Button(
                onClick = {
                    chImageResourceId.value = R.drawable.nono
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.DarkGray
                ),
                shape = RoundedCornerShape(60.dp)
            ) {
                Text(text = "夏威夷", color = Color.Green)
            }
        }

    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ) {
        Row(
            modifier = Modifier.padding(16.dp)
        ) {
            Button(onClick = {
                navController.navigate("JumpSix")
            }) {
                Text(text = "上一頁")
            }
            Spacer(modifier = Modifier.width(100.dp))

            Button(onClick = {
                navController.navigate("JumpEight")
            }) {
                Text(text = "下一頁")
            }
        }
    }
}



@Composable
fun EightScreen(navController: NavController) {
    val swedenImageResourceId = remember { mutableStateOf<Int?>(null) }
    val ukImageResourceId = remember { mutableStateOf<Int?>(null) }
    val twImageResourceId = remember { mutableStateOf<Int?>(null) }
    val chImageResourceId = remember { mutableStateOf<Int?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentHeight(align = Alignment.Top),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "猜猜是哪個國家的國旗",fontSize = 36.sp)
        Image(
            painter = painterResource(id = R.drawable.norway),
            contentDescription = ""
        )
    }

    Column(modifier = Modifier
        .fillMaxSize()
        .wrapContentWidth(align = Alignment.Start),
        verticalArrangement = Arrangement.Center,)
    {
        Spacer(modifier = Modifier.height(70.dp))
        if (swedenImageResourceId.value != null) {
            Image(
                painter = painterResource(id = swedenImageResourceId.value!!),
                contentDescription = "圖片"
            )
        } else {
            Button(
                onClick = {
                    swedenImageResourceId.value = R.drawable.circle
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.DarkGray
                ),
                shape = RoundedCornerShape(80.dp)
            ) {
                Text(text = "挪威", color = Color.Green)
            }
        }


        if (ukImageResourceId.value != null) {
            Image(
                painter = painterResource(id = ukImageResourceId.value!!),
                contentDescription = "圖片"
            )
        } else {
            Button(
                onClick = {
                    ukImageResourceId.value = R.drawable.nono
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.DarkGray
                ),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text(text = "挪威的森林", color = Color.Green)
            }
        }

        if (twImageResourceId.value != null) {
            Image(
                painter = painterResource(id = twImageResourceId.value!!),
                contentDescription = "圖片"
            )
        } else {
            Button(
                onClick = {
                    twImageResourceId.value = R.drawable.nono
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.DarkGray
                ),
                shape = RoundedCornerShape(60.dp)
            ) {
                Text(text = "澳洲", color = Color.Green)
            }
        }

        if (chImageResourceId.value != null) {
            Image(
                painter = painterResource(id = chImageResourceId.value!!),
                contentDescription = "圖片"
            )
        } else {
            Button(
                onClick = {
                    chImageResourceId.value = R.drawable.nono
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.DarkGray
                ),
                shape = RoundedCornerShape(60.dp)
            ) {
                Text(text = "日本", color = Color.Green)
            }
        }

    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ) {
        Row(
            modifier = Modifier.padding(16.dp)
        ) {
            Button(onClick = {
                navController.navigate("JumpSix")
            }) {
                Text(text = "上一頁")
            }
            Spacer(modifier = Modifier.width(100.dp))

            Button(onClick = {
                navController.navigate("JumpFirst")
            }) {
                Text(text = "回首頁")
            }
        }
    }
}

@Composable
fun NineScreen(navController: NavController) {
    val swedenImageResourceId = remember { mutableStateOf<Int?>(null) }
    val ukImageResourceId = remember { mutableStateOf<Int?>(null) }
    val twImageResourceId = remember { mutableStateOf<Int?>(null) }
    val chImageResourceId = remember { mutableStateOf<Int?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentHeight(align = Alignment.Top),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "這是什麼品種的狗狗呢",fontSize = 30.sp, color = Color.Blue)
        Image(
            painter = painterResource(id = R.drawable.yukxia),
            contentDescription = ""
        )
    }

    Spacer(modifier = Modifier.height(30.dp))

    Column(modifier = Modifier
        .fillMaxSize()
        .wrapContentWidth(align = Alignment.Start))
    {

            Spacer(modifier = Modifier.height(300.dp))
            if (swedenImageResourceId.value != null) {
                Image(
                    painter = painterResource(id = swedenImageResourceId.value!!),
                    contentDescription = "圖片"
                )
            } else {
                Button(
                    onClick = {
                        swedenImageResourceId.value = R.drawable.circle
                    },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.DarkGray
                    ),
                    shape = RoundedCornerShape(80.dp)
                ) {
                    Text(text = "約克夏", color = Color.Green)
                }
            }

            if (ukImageResourceId.value != null) {
                Image(
                    painter = painterResource(id = ukImageResourceId.value!!),
                    contentDescription = "圖片"
                )
            } else {
                Button(
                    onClick = {
                        ukImageResourceId.value = R.drawable.nono
                    },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.DarkGray
                    ),
                    shape = RoundedCornerShape(20.dp)
                ) {
                    Text(text = "柴犬", color = Color.Green)
                }
            }
        if (twImageResourceId.value != null) {
            Image(
                painter = painterResource(id = twImageResourceId.value!!),
                contentDescription = "圖片"
            )
        } else {
            Button(
                onClick = {
                    twImageResourceId.value = R.drawable.nono
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.DarkGray
                ),
                shape = RoundedCornerShape(60.dp)
            ) {
                Text(text = "西施", color = Color.Green)
            }
        }

        if (chImageResourceId.value != null) {
            Image(
                painter = painterResource(id = chImageResourceId.value!!),
                contentDescription = "圖片"
            )
        } else {
            Button(
                onClick = {
                    chImageResourceId.value = R.drawable.nono
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.DarkGray
                ),
                shape = RoundedCornerShape(60.dp)
            ) {
                Text(text = "黃金獵犬", color = Color.Green)
            }
        }

    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ) {
        Row(
            modifier = Modifier.padding(16.dp)
        ) {
            Button(onClick = {
                navController.navigate("JumpFirst")
            }) {
                Text(text = "回首頁")
            }
            Spacer(modifier = Modifier.width(100.dp))

            Button(onClick = {
                navController.navigate("JumpTen")
            }) {
                Text(text = "下一頁")
            }
        }
    }
}

@Composable
fun TenScreen(navController: NavController) {
    val swedenImageResourceId = remember { mutableStateOf<Int?>(null) }
    val ukImageResourceId = remember { mutableStateOf<Int?>(null) }
    val twImageResourceId = remember { mutableStateOf<Int?>(null) }
    val chImageResourceId = remember { mutableStateOf<Int?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentHeight(align = Alignment.Top),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "這是什麼品種的貓呢",fontSize = 30.sp, color = Color.Blue)
        Image(
            painter = painterResource(id = R.drawable.pos),
            contentDescription = ""
        )
    }

    Column(modifier = Modifier
        .fillMaxSize()
        .wrapContentWidth(align = Alignment.End),
        verticalArrangement = Arrangement.Center,)
    {
        Spacer(modifier = Modifier.height(70.dp))
        if (swedenImageResourceId.value != null) {
            Image(
                painter = painterResource(id = swedenImageResourceId.value!!),
                contentDescription = "圖片"
            )
        } else {
            Button(
                onClick = {
                    swedenImageResourceId.value = R.drawable.nono
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.DarkGray
                ),
                shape = RoundedCornerShape(80.dp)
            ) {
                Text(text = "摺耳貓", color = Color.Green)
            }
        }


        if (ukImageResourceId.value != null) {
            Image(
                painter = painterResource(id = ukImageResourceId.value!!),
                contentDescription = "圖片"
            )
        } else {
            Button(
                onClick = {
                    ukImageResourceId.value = R.drawable.nono
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.DarkGray
                ),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text(text = "暹羅貓", color = Color.Green)
            }
        }

        if (twImageResourceId.value != null) {
            Image(
                painter = painterResource(id = twImageResourceId.value!!),
                contentDescription = "圖片"
            )
        } else {
            Button(
                onClick = {
                    twImageResourceId.value = R.drawable.circle
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.DarkGray
                ),
                shape = RoundedCornerShape(60.dp)
            ) {
                Text(text = "布偶貓", color = Color.Green)
            }
        }

        if (chImageResourceId.value != null) {
            Image(
                painter = painterResource(id = chImageResourceId.value!!),
                contentDescription = "圖片"
            )
        } else {
            Button(
                onClick = {
                    chImageResourceId.value = R.drawable.nono
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.DarkGray
                ),
                shape = RoundedCornerShape(60.dp)
            ) {
                Text(text = "波斯貓", color = Color.Green)
            }
        }

    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ) {
        Row(
            modifier = Modifier.padding(16.dp)
        ) {
            Button(onClick = {
                navController.navigate("JumpNine")
            }) {
                Text(text = "上一頁")
            }
            Spacer(modifier = Modifier.width(100.dp))

            Button(onClick = {
                navController.navigate("JumpEleven")
            }) {
                Text(text = "下一頁")
            }
        }
    }
}

@Composable
fun ElevenScreen(navController: NavController) {
    val swedenImageResourceId = remember { mutableStateOf<Int?>(null) }
    val ukImageResourceId = remember { mutableStateOf<Int?>(null) }
    val twImageResourceId = remember { mutableStateOf<Int?>(null) }
    val chImageResourceId = remember { mutableStateOf<Int?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentHeight(align = Alignment.Top),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "這是什麼品種的貓呢",fontSize = 30.sp, color = Color.Blue)
        Image(
            painter = painterResource(id = R.drawable.booo),
            contentDescription = ""
        )
    }

    Column(modifier = Modifier
        .fillMaxSize())
    {
        Row(modifier = Modifier.padding(start = 8.dp, top = 380.dp, end = 16.dp, bottom = 8.dp))
        {
            if (swedenImageResourceId.value != null) {
                Image(
                    painter = painterResource(id = swedenImageResourceId.value!!),
                    contentDescription = "圖片"
                )
            } else {
                Button(
                    onClick = {
                        swedenImageResourceId.value = R.drawable.nono
                    },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.DarkGray
                    ),
                    shape = RoundedCornerShape(80.dp)
                ) {
                    Text(text = "曼赤肯", color = Color.Green)
                }
            }
            if (ukImageResourceId.value != null) {
                Image(
                    painter = painterResource(id = ukImageResourceId.value!!),
                    contentDescription = "圖片"
                )
            } else {
                Button(
                    onClick = {
                        ukImageResourceId.value = R.drawable.nono
                    },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.DarkGray
                    ),
                    shape = RoundedCornerShape(20.dp)
                ) {
                    Text(text = "豹貓", color = Color.Green)
                }
            }
            if (twImageResourceId.value != null) {
                Image(
                    painter = painterResource(id = twImageResourceId.value!!),
                    contentDescription = "圖片"
                )
            } else {
                Button(
                    onClick = {
                        twImageResourceId.value = R.drawable.nono
                    },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.DarkGray
                    ),
                    shape = RoundedCornerShape(60.dp)
                ) {
                    Text(text = "挪威森林貓", color = Color.Green)
                }
            }
            if (chImageResourceId.value != null) {
                Image(
                    painter = painterResource(id = chImageResourceId.value!!),
                    contentDescription = "圖片"
                )
            } else {
                Button(
                    onClick = {
                        chImageResourceId.value = R.drawable.circle
                    },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.DarkGray
                    ),
                    shape = RoundedCornerShape(60.dp)
                ) {
                    Text(text = "折耳貓", color = Color.Green)
                }
            }
        }
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ) {
        Row(
            modifier = Modifier.padding(16.dp)
        ) {
            Button(onClick = {
                navController.navigate("JumpTen")
            }) {
                Text(text = "上一頁")
            }
            Spacer(modifier = Modifier.width(100.dp))

            Button(onClick = {
                navController.navigate("JumpTwelve")
            }) {
                Text(text = "下一頁")
            }
        }
    }
}

@Composable
fun TwelveScreen(navController: NavController) {
    val swedenImageResourceId = remember { mutableStateOf<Int?>(null) }
    val ukImageResourceId = remember { mutableStateOf<Int?>(null) }
    val twImageResourceId = remember { mutableStateOf<Int?>(null) }
    val chImageResourceId = remember { mutableStateOf<Int?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentHeight(align = Alignment.Top),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start
    ) {
        Text(text = "這是什麼品種的狗狗呢",fontSize = 30.sp, color = Color.Blue)
        Spacer(modifier = Modifier.height(20.dp))
        Image(
            painter = painterResource(id = R.drawable.dog),
            contentDescription = ""
        )
    }

    Column(modifier = Modifier
        .fillMaxSize()
        .wrapContentWidth(align = Alignment.End))
    {
        Spacer(modifier = Modifier.height(60.dp))
        if (swedenImageResourceId.value != null) {
            Image(
                painter = painterResource(id = swedenImageResourceId.value!!),
                contentDescription = "圖片"
            )
        } else {
            Button(
                onClick = {
                    swedenImageResourceId.value = R.drawable.nono
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.DarkGray
                ),
                shape = RoundedCornerShape(80.dp)
            ) {
                Text(text = "博美犬", color = Color.Green)
            }
        }

        if (ukImageResourceId.value != null) {
            Image(
                painter = painterResource(id = ukImageResourceId.value!!),
                contentDescription = "圖片"
            )
        } else {
            Button(
                onClick = {
                    ukImageResourceId.value = R.drawable.nono
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.DarkGray
                ),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text(text = "雪納瑞", color = Color.Green)
            }
        }

        if (twImageResourceId.value != null) {
            Image(
                painter = painterResource(id = twImageResourceId.value!!),
                contentDescription = "圖片"
            )
        } else {
            Button(
                onClick = {
                    twImageResourceId.value = R.drawable.circle
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.DarkGray
                ),
                shape = RoundedCornerShape(60.dp)
            ) {
                Text(text = "科基", color = Color.Green)
            }
        }
        Spacer(modifier = Modifier.width(8.dp))
        if (chImageResourceId.value != null) {
            Image(
                painter = painterResource(id = chImageResourceId.value!!),
                contentDescription = "圖片"
            )
        } else {
            Button(
                onClick = {
                    chImageResourceId.value = R.drawable.nono
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.DarkGray
                ),
                shape = RoundedCornerShape(60.dp)
            ) {
                Text(text = "臘腸狗", color = Color.Green)
            }
        }

    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ) {
        Row(
            modifier = Modifier.padding(16.dp)
        ) {
            Button(onClick = {
                navController.navigate("JumpEleven")
            }) {
                Text(text = "上一頁")
            }
            Spacer(modifier = Modifier.width(100.dp))

            Button(onClick = {
                navController.navigate("JumpThirteen")
            }) {
                Text(text = "下一頁")
            }
        }
    }
}

@Composable
fun ThirteenScreen(navController: NavController) {
    val swedenImageResourceId = remember { mutableStateOf<Int?>(null) }
    val ukImageResourceId = remember { mutableStateOf<Int?>(null) }
    val twImageResourceId = remember { mutableStateOf<Int?>(null) }
    val chImageResourceId = remember { mutableStateOf<Int?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentHeight(align = Alignment.Top),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "進階題",fontSize = 30.sp, color = Color.Red)
        Text(text = "這是什麼品種的蟑螂?",fontSize = 20.sp, color = Color.Black)
        Image(
            painter = painterResource(id = R.drawable.katsa),
            contentDescription = ""
        )
    }

    Column(modifier = Modifier
        .fillMaxSize()
        .wrapContentWidth(align = Alignment.End))
    {
        Column(modifier = Modifier.padding(start = 25.dp, end = 50.dp)) {
            Row(
                modifier = Modifier.padding(top = 300.dp,bottom = 8.dp)
            ) {
                if (swedenImageResourceId.value != null) {
                    Image(
                        painter = painterResource(id = swedenImageResourceId.value!!),
                        contentDescription = "圖片"
                    )
                } else {
                    Button(
                        onClick = {
                            swedenImageResourceId.value = R.drawable.nono
                        },
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color.DarkGray
                        ),
                        shape = RoundedCornerShape(80.dp)
                    ) {
                        Text(text = "家屋蟑螂", color = Color.Green)
                    }
                }
                Spacer(modifier = Modifier.width(80.dp))
                if (ukImageResourceId.value != null) {
                    Image(
                        painter = painterResource(id = ukImageResourceId.value!!),
                        contentDescription = "圖片"
                    )
                } else {
                    Button(
                        onClick = {
                            ukImageResourceId.value = R.drawable.nono
                        },
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color.DarkGray
                        ),
                        shape = RoundedCornerShape(20.dp)
                    ) {
                        Text(text = "德國蟑螂", color = Color.Green)
                    }
                }
            }

            Row {
                if (twImageResourceId.value != null) {
                    Image(
                        painter = painterResource(id = twImageResourceId.value!!),
                        contentDescription = "圖片"
                    )
                } else {
                    Button(
                        onClick = {
                            twImageResourceId.value = R.drawable.circle
                        },
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color.DarkGray
                        ),
                        shape = RoundedCornerShape(60.dp)
                    ) {
                        Text(text = "美洲蟑螂", color = Color.Green)
                    }
                }
                Spacer(modifier = Modifier.width(80.dp))
                if (chImageResourceId.value != null) {
                    Image(
                        painter = painterResource(id = chImageResourceId.value!!),
                        contentDescription = "圖片"
                    )
                } else {
                    Button(
                        onClick = {
                            chImageResourceId.value = R.drawable.nono
                        },
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color.DarkGray
                        ),
                        shape = RoundedCornerShape(60.dp)
                    ) {
                        Text(text = "澳洲蟑螂", color = Color.Green)
                    }
                }
            }
        }
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ) {
        Row(
            modifier = Modifier.padding(16.dp)
        ) {
            Button(onClick = {
                navController.navigate("JumpTwelve")
            }) {
                Text(text = "上一頁")
            }
            Spacer(modifier = Modifier.width(100.dp))

            Button(onClick = {
                navController.navigate("JumpFirst")
            }) {
                Text(text = "回首頁")
            }
        }
    }
}


    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        FinalTheme {
            Greeting("Android")
        }
    }