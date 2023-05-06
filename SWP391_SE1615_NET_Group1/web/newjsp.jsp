<!DOCTYPE html>
<html lang="en">
    <head>
        <title> Bootstrap SORT table Example </title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://cdn.datatables.net/1.10.22/css/dataTables.bootstrap4.min.css">
        <script src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.min.js"></script>
        <script src="https://cdn.datatables.net/1.10.22/js/dataTables.bootstrap4.min.js"></script>
    </head>
    <body>
        <div class="container" style="width:40%";>
            <h2> Bootstrap Sort Table </h2>
            <table class="table table-striped table-bordered" id="sortTable">
                <thead>
                    <tr>
                        <th>Firstname</th>
                        <th>Lastname</th>
                        <th>Email</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Adam</td>
                        <td>joo</td>
                        <td>Jadamj@yahoo.com</td>
                    </tr>
                    <tr>
                        <td>seri</td>
                        <td>sami</td>
                        <td>ami_seri@rediff.com</td>
                    </tr>
                    <tr>
                        <td>zeniya</td>
                        <td>deo</td>
                        <td>zee@gmail.com</td>
                    </tr>
                </tbody>
            </table>
        </div>
        <script>
            $('#sortTable').DataTable();
        </script>
    </body>
</html>