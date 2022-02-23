// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.healthcare_v1beta1.outputs.SchemaPackageResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ParserConfigResponse {
    /**
     * Determines whether messages with no header are allowed.
     * 
     */
    private final Boolean allowNullHeader;
    /**
     * Schemas used to parse messages in this store, if schematized parsing is desired.
     * 
     */
    private final SchemaPackageResponse schema;
    /**
     * Byte(s) to use as the segment terminator. If this is unset, '\r' is used as segment terminator, matching the HL7 version 2 specification.
     * 
     */
    private final String segmentTerminator;
    /**
     * Immutable. Determines the version of both the default parser to be used when `schema` is not given, as well as the schematized parser used when `schema` is specified. This field is immutable after HL7v2 store creation.
     * 
     */
    private final String version;

    @OutputCustomType.Constructor({"allowNullHeader","schema","segmentTerminator","version"})
    private ParserConfigResponse(
        Boolean allowNullHeader,
        SchemaPackageResponse schema,
        String segmentTerminator,
        String version) {
        this.allowNullHeader = Objects.requireNonNull(allowNullHeader);
        this.schema = Objects.requireNonNull(schema);
        this.segmentTerminator = Objects.requireNonNull(segmentTerminator);
        this.version = Objects.requireNonNull(version);
    }

    /**
     * Determines whether messages with no header are allowed.
     * 
     */
    public Boolean getAllowNullHeader() {
        return this.allowNullHeader;
    }
    /**
     * Schemas used to parse messages in this store, if schematized parsing is desired.
     * 
     */
    public SchemaPackageResponse getSchema() {
        return this.schema;
    }
    /**
     * Byte(s) to use as the segment terminator. If this is unset, '\r' is used as segment terminator, matching the HL7 version 2 specification.
     * 
     */
    public String getSegmentTerminator() {
        return this.segmentTerminator;
    }
    /**
     * Immutable. Determines the version of both the default parser to be used when `schema` is not given, as well as the schematized parser used when `schema` is specified. This field is immutable after HL7v2 store creation.
     * 
     */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParserConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowNullHeader;
        private SchemaPackageResponse schema;
        private String segmentTerminator;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ParserConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowNullHeader = defaults.allowNullHeader;
    	      this.schema = defaults.schema;
    	      this.segmentTerminator = defaults.segmentTerminator;
    	      this.version = defaults.version;
        }

        public Builder setAllowNullHeader(Boolean allowNullHeader) {
            this.allowNullHeader = Objects.requireNonNull(allowNullHeader);
            return this;
        }

        public Builder setSchema(SchemaPackageResponse schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }

        public Builder setSegmentTerminator(String segmentTerminator) {
            this.segmentTerminator = Objects.requireNonNull(segmentTerminator);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public ParserConfigResponse build() {
            return new ParserConfigResponse(allowNullHeader, schema, segmentTerminator, version);
        }
    }
}
