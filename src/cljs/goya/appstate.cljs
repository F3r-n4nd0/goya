(ns goya.appstate)


(def app-state
  (atom
    {:main-app
      {
       :palette
       [{:color "#228751"}
        {:color "#007536"}
        {:color "#65016C"}
        {:color "#C936D3"}
        {:color "#A67A00"}
        {:color "#BF9930"}]

       :animation
       [
        {:image-data ["#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#ae9d94" "#ae9d94" "#ae9d94" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#f5b28b" "#f5b28b" "#f5b28b" "#f5b28b" "#c17c6a" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#ae9d94" "#5a5a5a" "#feb890" "#f5b28b" "#f5b28b" "#f5b28b" "#d7a386" "#d7a386" "#c17c6a" "#5a5a5a" "#7a7a7a" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#ae9d94" "#7a7a7a" "#feb890" "#f5b28b" "#f5b28b" "#f5b28b" "#d7a386" "#d7a386" "#d7a386" "#d7a386" "#c17c6a" "#5a5a5a" "#7a7a7a" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#7a7a7a" "#5a5a5a" "#d7a386" "#d7a386" "#d7a386" "#d7a386" "#d7a386" "#d7a386" "#d7a386" "#d7a386" "#5a5a5a" "#5a5a5a" "#5a5a5a" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#d7a386" "#c17c6a" "#T" "#c17c6a" "#c17c6a" "#c17c6a" "#c17c6a" "#T" "#c17c6a" "#d7a386" "#c17c6a" "#d7a386" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#d7a386" "#d7a386" "#c17c6a" "#c17c6a" "#feb890" "#d7a386" "#c17c6a" "#c17c6a" "#d7a386" "#d7a386" "#63513d" "#c17c6a" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#c17c6a" "#d7a386" "#c17c6a" "#3f4245" "#d7a386" "#d7a386" "#3f4245" "#c17c6a" "#d7a386" "#d7a386" "#d7a386" "#483729" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#d7a386" "#7a7a7a" "#484b4d" "#3f4245" "#3f4245" "#3f4245" "#63513d" "#d7a386" "#d7a386" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#7a7a7a" "#484b4d" "#483729" "#d7a386" "#d7a386" "#d7a386" "#d7a386" "#483729" "#483729" "#63513d" "#232323" "#232323" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#232323" "#a36859" "#d7a386" "#f5b28b" "#f5b28b" "#f5b28b" "#d7a386" "#d7a386" "#a36859" "#483729" "#232323" "#232323" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#232323" "#232323" "#c17c6a" "#f5b28b" "#f5b28b" "#f5b28b" "#d7a386" "#c17c6a" "#63513d" "#ae9d94" "#232323" "#232323" "#232323" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#544433" "#31251a" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#232323" "#232323" "#232323" "#ae9d94" "#c17c6a" "#c17c6a" "#c17c6a" "#c17c6a" "#ae9d94" "#fdf5ed" "#484b4d" "#232323" "#232323" "#232323" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#232323" "#232323" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#232323" "#232323" "#232323" "#232323" "#fdf5ed" "#ae9d94" "#T" "#T" "#ae9d94" "#fdf5ed" "#5a5e61" "#484b4d" "#232323" "#232323" "#232323" "#232323" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#232323" "#232323" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#232323" "#232323" "#232323" "#232323" "#3f4245" "#494d51" "#fdf5ed" "#T" "#T" "#fdf5ed" "#5a5e61" "#5a5e61" "#232323" "#232323" "#232323" "#232323" "#232323" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#406e74" "#21626c" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#232323" "#232323" "#232323" "#232323" "#232323" "#494d51" "#494d51" "#494d51" "#232323" "#T" "#3f4245" "#5a5e61" "#5a5e61" "#232323" "#232323" "#232323" "#232323" "#232323" "#232323" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#406e74" "#406e74" "#1b5660" "#1b5660" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#232323" "#232323" "#232323" "#232323" "#232323" "#494d51" "#494d51" "#494d51" "#323940" "#3f4245" "#5a5e61" "#5a5e61" "#5a5e61" "#232323" "#232323" "#232323" "#232323" "#232323" "#232323" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#406e74" "#7a7a7a" "#7a7a7a" "#26464a" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#232323" "#232323" "#232323" "#232323" "#232323" "#232323" "#494d51" "#494d51" "#494d51" "#3f4245" "#5a5e61" "#5a5e61" "#5a5e61" "#232323" "#232323" "#232323" "#232323" "#232323" "#232323" "#232323" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#406e74" "#7a7a7a" "#7a7a7a" "#26464a" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#232323" "#232323" "#232323" "#232323" "#232323" "#232323" "#494d51" "#494d51" "#3f4245" "#5a5e61" "#5a5e61" "#5a5e61" "#5a5e61" "#232323" "#232323" "#232323" "#232323" "#232323" "#232323" "#232323" "#T" "#T" "#T" "#T" "#T" "#ae9d94" "#ae9d94" "#ae9d94" "#7a7a7a" "#5a5e61" "#T" "#T" "#T" "#T" "#406e74" "#ae9d94" "#7a7a7a" "#26464a" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#232323" "#121212" "#232323" "#232323" "#232323" "#232323" "#232323" "#494d51" "#494d51" "#3f4245" "#dda55d" "#5a5e61" "#5a5e61" "#5a5e61" "#232323" "#232323" "#232323" "#232323" "#232323" "#232323" "#232323" "#T" "#T" "#T" "#T" "#T" "#7a7a7a" "#ae9d94" "#7a7a7a" "#7a7a7a" "#5a5e61" "#T" "#T" "#T" "#T" "#406e74" "#ae9d94" "#7a7a7a" "#26464a" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#232323" "#121212" "#232323" "#232323" "#232323" "#232323" "#232323" "#494d51" "#494d51" "#3f4245" "#494d51" "#5a5e61" "#5a5e61" "#5a5e61" "#232323" "#232323" "#232323" "#232323" "#232323" "#232323" "#232323" "#T" "#T" "#T" "#T" "#T" "#T" "#7a7a7a" "#5a5e61" "#484b4d" "#T" "#T" "#T" "#T" "#T" "#1b5660" "#7a7a7a" "#7a7a7a" "#26464a" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#232323" "#232323" "#121212" "#121212" "#232323" "#232323" "#232323" "#232323" "#232323" "#494d51" "#494d51" "#3f4245" "#5a5e61" "#5a5e61" "#5a5e61" "#5a5e61" "#232323" "#232323" "#232323" "#171717" "#232323" "#232323" "#232323" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#484b4d" "#T" "#T" "#T" "#T" "#T" "#T" "#1b5660" "#1b5660" "#26464a" "#26464a" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#434343" "#484b4d" "#232323" "#232323" "#121212" "#121212" "#121212" "#232323" "#232323" "#232323" "#232323" "#232323" "#494d51" "#494d51" "#3f4245" "#f3b667" "#5a5e61" "#5a5e61" "#5a5e61" "#232323" "#232323" "#232323" "#171717" "#232323" "#232323" "#232323" "#T" "#T" "#T" "#T" "#T" "#T" "#7a7a7a" "#7a7a7a" "#5a5e61" "#T" "#T" "#T" "#T" "#T" "#26464a" "#21626c" "#21626c" "#26464a" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#d7a386" "#c17c6a" "#434343" "#232323" "#121212" "#121212" "#121212" "#121212" "#232323" "#232323" "#232323" "#232323" "#232323" "#494d51" "#494d51" "#3f4245" "#494d51" "#5a5e61" "#5a5e61" "#5a5e61" "#232323" "#232323" "#232323" "#171717" "#232323" "#232323" "#232323" "#T" "#T" "#63513d" "#63513d" "#63513d" "#63513d" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#63513d" "#63513d" "#63513d" "#63513d" "#63513d" "#63513d" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#d7a386" "#c17c6a" "#c17c6a" "#c17c6a" "#T" "#T" "#T" "#T" "#T" "#232323" "#232323" "#232323" "#232323" "#232323" "#494d51" "#494d51" "#3f4245" "#5a5e61" "#5a5e61" "#5a5e61" "#232323" "#232323" "#232323" "#171717" "#171717" "#232323" "#232323" "#T" "#T" "#T" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#63513d" "#63513d" "#63513d" "#63513d" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#91785b" "#c17c6a" "#c17c6a" "#63513d" "#63513d" "#63513d" "#63513d" "#63513d" "#T" "#T" "#T" "#232323" "#232323" "#232323" "#232323" "#232323" "#494d51" "#494d51" "#3f4245" "#dda55d" "#5a5e61" "#5a5e61" "#232323" "#232323" "#232323" "#171717" "#171717" "#232323" "#232323" "#T" "#T" "#T" "#T" "#31251a" "#31251a" "#31251a" "#31251a" "#31251a" "#31251a" "#31251a" "#31251a" "#31251a" "#31251a" "#31251a" "#31251a" "#31251a" "#31251a" "#31251a" "#31251a" "#31251a" "#31251a" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#544433" "#544433" "#31251a" "#31251a" "#31251a" "#31251a" "#T" "#T" "#T" "#T" "#T" "#232323" "#232323" "#232323" "#232323" "#494d51" "#494d51" "#3f4245" "#494d51" "#5a5e61" "#5a5e61" "#232323" "#232323" "#232323" "#171717" "#171717" "#232323" "#63513d" "#T" "#T" "#T" "#T" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#63513d" "#63513d" "#483729" "#483729" "#483729" "#483729" "#T" "#T" "#T" "#T" "#T" "#T" "#252b31" "#232323" "#232323" "#494d51" "#494d51" "#3f4245" "#5a5e61" "#5a5e61" "#5a5e61" "#232323" "#232323" "#232323" "#171717" "#a36859" "#cf967c" "#cf967c" "#T" "#T" "#T" "#T" "#544433" "#544433" "#63513d" "#31251a" "#31251a" "#31251a" "#31251a" "#31251a" "#31251a" "#31251a" "#31251a" "#31251a" "#31251a" "#31251a" "#31251a" "#63513d" "#544433" "#544433" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#63513d" "#63513d" "#483729" "#483729" "#483729" "#483729" "#T" "#T" "#T" "#T" "#T" "#T" "#252b31" "#252b31" "#252b31" "#252b31" "#252b31" "#323940" "#323940" "#323940" "#323940" "#232323" "#323940" "#323940" "#323940" "#cf967c" "#cf967c" "#T" "#T" "#T" "#T" "#T" "#544433" "#544433" "#63513d" "#483729" "#544433" "#544433" "#483729" "#483729" "#483729" "#483729" "#483729" "#544433" "#544433" "#544433" "#544433" "#63513d" "#544433" "#544433" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#63513d" "#63513d" "#483729" "#483729" "#483729" "#483729" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#252b31" "#252b31" "#252b31" "#252b31" "#323940" "#323940" "#323940" "#323940" "#323940" "#323940" "#323940" "#cf967c" "#d7a386" "#T" "#T" "#T" "#T" "#T" "#T" "#544433" "#544433" "#63513d" "#483729" "#483729" "#483729" "#483729" "#412e19" "#412e19" "#412e19" "#483729" "#483729" "#544433" "#544433" "#544433" "#63513d" "#544433" "#544433" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#63513d" "#63513d" "#483729" "#483729" "#483729" "#483729" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#252b31" "#252b31" "#252b31" "#252b31" "#323940" "#323940" "#323940" "#323940" "#323940" "#323940" "#323940" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#544433" "#544433" "#63513d" "#483729" "#483729" "#483729" "#412e19" "#483729" "#483729" "#483729" "#412e19" "#483729" "#483729" "#483729" "#544433" "#63513d" "#544433" "#544433" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#63513d" "#63513d" "#483729" "#483729" "#483729" "#483729" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#252b31" "#252b31" "#252b31" "#252b31" "#323940" "#323940" "#323940" "#323940" "#323940" "#323940" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#544433" "#544433" "#63513d" "#483729" "#483729" "#483729" "#412e19" "#483729" "#483729" "#483729" "#483729" "#483729" "#483729" "#483729" "#544433" "#63513d" "#544433" "#544433" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#63513d" "#63513d" "#483729" "#483729" "#483729" "#483729" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#252b31" "#252b31" "#252b31" "#323940" "#323940" "#323940" "#323940" "#323940" "#323940" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#544433" "#544433" "#63513d" "#483729" "#483729" "#483729" "#412e19" "#483729" "#483729" "#412e19" "#412e19" "#483729" "#483729" "#483729" "#483729" "#63513d" "#544433" "#544433" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#63513d" "#63513d" "#483729" "#483729" "#483729" "#483729" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#252b31" "#252b31" "#252b31" "#323940" "#323940" "#323940" "#323940" "#323940" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#544433" "#544433" "#63513d" "#483729" "#483729" "#483729" "#412e19" "#483729" "#483729" "#483729" "#412e19" "#483729" "#483729" "#483729" "#483729" "#63513d" "#544433" "#544433" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#63513d" "#63513d" "#483729" "#483729" "#483729" "#483729" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#252b31" "#252b31" "#323940" "#323940" "#323940" "#323940" "#323940" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#544433" "#544433" "#63513d" "#483729" "#483729" "#483729" "#483729" "#412e19" "#412e19" "#412e19" "#483729" "#483729" "#483729" "#483729" "#483729" "#63513d" "#544433" "#544433" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#63513d" "#63513d" "#483729" "#483729" "#483729" "#483729" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#323940" "#323940" "#5a5e61" "#5a5e61" "#5a5e61" "#5a5e61" "#5a5e61" "#5a5e61" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#544433" "#544433" "#63513d" "#483729" "#483729" "#483729" "#483729" "#483729" "#483729" "#483729" "#483729" "#544433" "#544433" "#483729" "#483729" "#63513d" "#544433" "#544433" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#483729" "#63513d" "#63513d" "#483729" "#483729" "#483729" "#483729" "#63513d" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#232323" "#232323" "#232323" "#232323" "#232323" "#232323" "#3f4245" "#3f4245" "#3f4245" "#T" "#T" "#T" "#T" "#T" "#T" "#T" "#483729" "#544433" "#544433" "#544433" "#63513d" "#63513d" "#63513d" "#63513d" "#63513d" "#63513d" "#63513d" "#63513d" "#63513d" "#63513d" "#63513d" "#63513d" "#544433" "#544433" "#544433" "#483729" "#T" "#T" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#483729" "#483729" "#63513d" "#63513d" "#483729" "#483729" "#483729" "#483729" "#63513d" "#63513d" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#232323" "#232323" "#232323" "#232323" "#232323" "#232323" "#232323" "#232323" "#232323" "#232323" "#232323" "#232323" "#232323" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#483729" "#483729" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#544433" "#483729" "#483729" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#1c1206" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#211609" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206" "#1c1206"]}
       ]

       :canvas-width 64
       :canvas-height 64

       :editing-frame 0
       :preview-frame 0

       :undo-history
         [{:action "Opened New Canvas" :icon "tag"}]
      }


     :onion-skin :off

     :info
     {
       :title "Goya"
       :subtitle "pixel art studio"
       :version "v0.0.7a"
     }

     :zoom-factor 6

     :tools
     {
       :paint-color "#828282"
       :paint-tool :brush
       :grid-on false
     }

     :history-menu-items{:undo {:text "Undo"}
                         :redo {:text "Redo"}}

     :main-menu-items{:new-document {:text "New Project" :icon "icon-tag" :command :new-doc}
                      :inspiration {:text "Inspiration from the Masters" :icon "icon-cloud-flash" :command :inspire}
                      :save-document {:text "Save Project" :icon "icon-download" :command :save-doc}
                      :load-document {:text "Load Project" :icon "icon-upload" :command :load-doc}
                      :export-document {:text "Export Frame as PNG" :icon "icon-picture" :command :export-doc}
                      :export-document-spritesheet {:text "Export as Sprite-Sheet PNG" :icon "icon-grid" :command :export-spritesheet}
                      :export-document-animation {:text "Export as GIF" :icon "icon-video" :command :export-animation}
                      :export-history-animation {:text "Export History as GIF" :icon "icon-video" :command :export-history-animation}}}))
