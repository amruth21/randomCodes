function collectFrames(){
    canvas = document.getElementById("canvas")
    video = document.getElementById("videoElement")
    var context = canvas.getContext('2d');
    if (width && height) {
      canvas.width = width;
      canvas.height = height;
      context.drawImage(video, 0, 0, width, height);
      var data = canvas.toDataURL('image/png');
      console.log(data)
    }
}



function functionOCR(output){

    $("#output").append(("dejujfje").text());
}