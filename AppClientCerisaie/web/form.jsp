<%--
  Created by IntelliJ IDEA.
  User: Nejko
  Date: 03-Jun-18
  Time: 5:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="form-style-5">
    <form name='inscription' method="post" action="" onsubmit="return test()">
        <fieldset>
            <legend><span class="number">1</span>Info Client</legend>
            <input type="text" name="field1" id="nom" placeholder="Votre nom *">
            <input type="text" name="field2" id="prenom" placeholder="Votre prénom *">
            <textarea name="field3" placeholder="About yourself"></textarea>
        </fieldset>
        <fieldset>
            <legend><span class="number">2</span>Info activités</legend>
            <label for="activity">Choix :</label>
            <select id="activity" name="field4">
                <optgroup label="Sur l'eau">
                    <option value="canoe">Canoë</option>
                    <option value="plancheVoile">Planche à voile</option>
                    <option value="pedalo">Pédalo</option>
                </optgroup>
                <optgroup label="Sur terre">
                    <option value="baladeEquestre">Balade équestre</option>
                    <option value="tennis">Tennis</option>
                    <option value="vtt">Vélo tout terrain</option>
                </optgroup>
            </select>
            <label for="jourActivite">Choisissez le(s) jour(s):</label>
            <input type="date" id="jourActivite" name="jourActivite" required pattern="[0-9]{4}-[0-9]{2}-[0-9]{2}">
        </fieldset>
        <input type="submit" value="S'inscrire" />
    </form>
</div>