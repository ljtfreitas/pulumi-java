// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class Hl7StoreParserConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final Hl7StoreParserConfigArgs Empty = new Hl7StoreParserConfigArgs();

    /**
     * Determines whether messages with no header are allowed.
     * 
     */
    @InputImport(name="allowNullHeader")
        private final @Nullable Input<Boolean> allowNullHeader;

    public Input<Boolean> getAllowNullHeader() {
        return this.allowNullHeader == null ? Input.empty() : this.allowNullHeader;
    }

    /**
     * JSON encoded string for schemas used to parse messages in this
     * store if schematized parsing is desired.
     * 
     */
    @InputImport(name="schema")
        private final @Nullable Input<String> schema;

    public Input<String> getSchema() {
        return this.schema == null ? Input.empty() : this.schema;
    }

    /**
     * Byte(s) to be used as the segment terminator. If this is unset, '\r' will be used as segment terminator.
     * A base64-encoded string.
     * 
     */
    @InputImport(name="segmentTerminator")
        private final @Nullable Input<String> segmentTerminator;

    public Input<String> getSegmentTerminator() {
        return this.segmentTerminator == null ? Input.empty() : this.segmentTerminator;
    }

    /**
     * The version of the unschematized parser to be used when a custom `schema` is not set.
     * Default value is `V1`.
     * Possible values are `V1` and `V2`.
     * 
     */
    @InputImport(name="version")
        private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public Hl7StoreParserConfigArgs(
        @Nullable Input<Boolean> allowNullHeader,
        @Nullable Input<String> schema,
        @Nullable Input<String> segmentTerminator,
        @Nullable Input<String> version) {
        this.allowNullHeader = allowNullHeader;
        this.schema = schema;
        this.segmentTerminator = segmentTerminator;
        this.version = version;
    }

    private Hl7StoreParserConfigArgs() {
        this.allowNullHeader = Input.empty();
        this.schema = Input.empty();
        this.segmentTerminator = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Hl7StoreParserConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowNullHeader;
        private @Nullable Input<String> schema;
        private @Nullable Input<String> segmentTerminator;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(Hl7StoreParserConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowNullHeader = defaults.allowNullHeader;
    	      this.schema = defaults.schema;
    	      this.segmentTerminator = defaults.segmentTerminator;
    	      this.version = defaults.version;
        }

        public Builder setAllowNullHeader(@Nullable Input<Boolean> allowNullHeader) {
            this.allowNullHeader = allowNullHeader;
            return this;
        }

        public Builder setAllowNullHeader(@Nullable Boolean allowNullHeader) {
            this.allowNullHeader = Input.ofNullable(allowNullHeader);
            return this;
        }

        public Builder setSchema(@Nullable Input<String> schema) {
            this.schema = schema;
            return this;
        }

        public Builder setSchema(@Nullable String schema) {
            this.schema = Input.ofNullable(schema);
            return this;
        }

        public Builder setSegmentTerminator(@Nullable Input<String> segmentTerminator) {
            this.segmentTerminator = segmentTerminator;
            return this;
        }

        public Builder setSegmentTerminator(@Nullable String segmentTerminator) {
            this.segmentTerminator = Input.ofNullable(segmentTerminator);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public Hl7StoreParserConfigArgs build() {
            return new Hl7StoreParserConfigArgs(allowNullHeader, schema, segmentTerminator, version);
        }
    }
}
