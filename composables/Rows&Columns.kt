/*
 *  Simple Layout elements are rows and columns to organize the position of elements in the GUI.
 *  Composables can get tweaked by specifying their modifier, default values do exist.
 *  Inside of it other composables are set: content = { ... }
 */



// Example of a column with three elements inside, spaced by 10.dp
// the last one is a row, containing two elements itself.
@Composable
Column(
    // no modifier is specified here, it uses its default values
    verticalArrangement = Arrangement.spacedBy(10.dp),
    content = {
        Text(
            modifier = Modifier.padding(12.dp),
            text = "Lorem ipsum", fontSize = 48.sp,
            fontWeight = FontWeight.Medium
        )
        Divider(
            Modifier.padding(12.dp)
        )
        Row(
            modifier = Modifier.fillMaxWidth().padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            content = {
                Text("dolor sit")
                Switch(
                    checked = checkedState1.value,
                    onCheckedChange = { checkedState1.value = it }
                )
            }
        )
    }
)



// Example of a Row with two buttons inside,
// SpaceBetween places the first on the left and the second all to the right end of the row.
@Composable
Row(
    modifier = Modifier.fillMaxWidth().padding(12.dp),
    verticalAlignment = Alignment.CenterVertically,
    horizontalArrangement = Arrangement.SpaceBetween,
    content = {
        Button(onClick = { /* Do something! */ }) {
            Text("Cancel")
        }
        Button(onClick = { /* Do something! */ }) {
            Text("Save")
        }
    }
)