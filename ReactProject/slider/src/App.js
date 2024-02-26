import Slider from "react-slick";
import "slick-carousel/slick/slick.css"; 
import "slick-carousel/slick/slick-theme.css";

function App() {
  const settings = {
    dots: true,
    infinite: true,
    speed: 500,
    slidesToShow: 3,
    slidesToScroll: 1
  };
  return (
    <div className='w-3/4 m-auto'>
      <div className="mt-20">
      <Slider {...settings}>
        {data.map((d) => (
          <div key={d.name} className="bg-white h-[450px] text-black rounded-xl">
            <div className='h-56 bg-indigo-500 flex justify-center items-center rounded-t-xl'>
              <img src={d.img} alt="" className="h-44 w-44 rounded-full"/>
            </div>

            <div className="flex flex-col items-center justify-center gap-4 p-4">
              <p className="text-xl font-semibold">{d.name}</p>
              <p className="text-center">{d.review}</p>
              <button className='bg-indigo-500 text-white text-lg px-6 py-1 rounded-xl'>Read More</button>
            </div>
          </div>
        ))}
      </Slider>
      </div>
      
    </div>
  );
}

const data = [
  {
    name: `Sourav Kumar Singh`,
    img: `/students/Sourav.JPG`,
    review: ` I am an adept learner with a passion for delving into the depths of cutting-edge technology.
     My areas of expertise include Cloud Technology and Java Full Stack Development,
     where I've honed my skills to create innovative solutions and user-friendly interfaces.`
  },
  {
    name: `Green Wallpaper`,
    img: `/students/1.jpg`,
    review: `Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.`
  },
  {
    name: `Spider Man`,
    img: `/students/2.jpg`,
    review: `My Name is Peter Parker, and I've Been Spider-Man Since I Was Fifteen Years Old.`
  },
  {
    name: `Never Give Up`,
    img: `/students/3.jpg`,
    review: `When the going gets tough, put one foot in front of the other and just keep going. Don’t give up.`
  },
  
];

export default App;