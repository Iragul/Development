package Com.jsontoxml;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.XmlPrettyPrinter;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
import org.codehaus.stax2.XMLStreamWriter2;
import org.codehaus.stax2.typed.Base64Variant;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

@RestController

public class jsontoxml {

@PostMapping("/jsontoxml")
public String convertJsonToXml(@RequestBody String jsonstring) {
    String xmlString = "";
    try {
        ObjectMapper jsonMapper = new ObjectMapper();
        JsonNode jsonNode = jsonMapper.readTree(jsonstring);

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.setDefaultPrettyPrinter(new XmlPrettyPrinter() {
            @Override
            public void writeRootValueSeparator(JsonGenerator jsonGenerator) throws IOException {

            }

            @Override
            public void writeStartObject(JsonGenerator jsonGenerator) throws IOException {

            }

            @Override
            public void writeEndObject(JsonGenerator jsonGenerator, int i) throws IOException {

            }

            @Override
            public void writeObjectEntrySeparator(JsonGenerator jsonGenerator) throws IOException {

            }

            @Override
            public void writeObjectFieldValueSeparator(JsonGenerator jsonGenerator) throws IOException {

            }

            @Override
            public void writeStartArray(JsonGenerator jsonGenerator) throws IOException {

            }

            @Override
            public void writeEndArray(JsonGenerator jsonGenerator, int i) throws IOException {

            }

            @Override
            public void writeArrayValueSeparator(JsonGenerator jsonGenerator) throws IOException {

            }

            @Override
            public void beforeArrayValues(JsonGenerator jsonGenerator) throws IOException {

            }

            @Override
            public void beforeObjectEntries(JsonGenerator jsonGenerator) throws IOException {

            }

            @Override
            public void writeStartElement(XMLStreamWriter2 xmlStreamWriter2, String s, String s1) throws XMLStreamException {

            }

            @Override
            public void writeEndElement(XMLStreamWriter2 xmlStreamWriter2, int i) throws XMLStreamException {

            }

            @Override
            public void writePrologLinefeed(XMLStreamWriter2 xmlStreamWriter2) throws XMLStreamException {

            }

            @Override
            public void writeLeafElement(XMLStreamWriter2 xmlStreamWriter2, String s, String s1, String s2, boolean b) throws XMLStreamException {

            }

            @Override
            public void writeLeafElement(XMLStreamWriter2 xmlStreamWriter2, String s, String s1, char[] chars, int i, int i1, boolean b) throws XMLStreamException {

            }

            @Override
            public void writeLeafElement(XMLStreamWriter2 xmlStreamWriter2, String s, String s1, boolean b) throws XMLStreamException {

            }

            @Override
            public void writeLeafElement(XMLStreamWriter2 xmlStreamWriter2, String s, String s1, int i) throws XMLStreamException {

            }

            @Override
            public void writeLeafElement(XMLStreamWriter2 xmlStreamWriter2, String s, String s1, long l) throws XMLStreamException {

            }

            @Override
            public void writeLeafElement(XMLStreamWriter2 xmlStreamWriter2, String s, String s1, double v) throws XMLStreamException {

            }

            @Override
            public void writeLeafElement(XMLStreamWriter2 xmlStreamWriter2, String s, String s1, float v) throws XMLStreamException {

            }

            @Override
            public void writeLeafElement(XMLStreamWriter2 xmlStreamWriter2, String s, String s1, BigInteger bigInteger) throws XMLStreamException {

            }

            @Override
            public void writeLeafElement(XMLStreamWriter2 xmlStreamWriter2, String s, String s1, BigDecimal bigDecimal) throws XMLStreamException {

            }

            @Override
            public void writeLeafElement(XMLStreamWriter2 xmlStreamWriter2, String s, String s1, Base64Variant base64Variant, byte[] bytes, int i, int i1) throws XMLStreamException {

            }

            @Override
            public void writeLeafNullElement(XMLStreamWriter2 xmlStreamWriter2, String s, String s1) throws XMLStreamException {

            }
        });

        // Configure XML generator for indentation
        xmlMapper.getFactory().configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);
        // Convert JsonNode to XML string
        xmlString = xmlMapper.writeValueAsString(jsonNode);

        // Print the XML string
    } catch (Exception e) {
        System.out.println(e);
    }
    return xmlString;
}
}
