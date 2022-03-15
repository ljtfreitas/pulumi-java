// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.healthcare_v1beta1.enums.ParserConfigVersion;
import io.pulumi.googlenative.healthcare_v1beta1.inputs.SchemaPackageArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration for the parser. It determines how the server parses the messages.
 * 
 */
public final class ParserConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ParserConfigArgs Empty = new ParserConfigArgs();

    /**
     * Determines whether messages with no header are allowed.
     * 
     */
    @Import(name="allowNullHeader")
      private final @Nullable Output<Boolean> allowNullHeader;

    public Output<Boolean> getAllowNullHeader() {
        return this.allowNullHeader == null ? Output.empty() : this.allowNullHeader;
    }

    /**
     * Schemas used to parse messages in this store, if schematized parsing is desired.
     * 
     */
    @Import(name="schema")
      private final @Nullable Output<SchemaPackageArgs> schema;

    public Output<SchemaPackageArgs> getSchema() {
        return this.schema == null ? Output.empty() : this.schema;
    }

    /**
     * Byte(s) to use as the segment terminator. If this is unset, '\r' is used as segment terminator, matching the HL7 version 2 specification.
     * 
     */
    @Import(name="segmentTerminator")
      private final @Nullable Output<String> segmentTerminator;

    public Output<String> getSegmentTerminator() {
        return this.segmentTerminator == null ? Output.empty() : this.segmentTerminator;
    }

    /**
     * Immutable. Determines the version of both the default parser to be used when `schema` is not given, as well as the schematized parser used when `schema` is specified. This field is immutable after HL7v2 store creation.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<ParserConfigVersion> version;

    public Output<ParserConfigVersion> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public ParserConfigArgs(
        @Nullable Output<Boolean> allowNullHeader,
        @Nullable Output<SchemaPackageArgs> schema,
        @Nullable Output<String> segmentTerminator,
        @Nullable Output<ParserConfigVersion> version) {
        this.allowNullHeader = allowNullHeader;
        this.schema = schema;
        this.segmentTerminator = segmentTerminator;
        this.version = version;
    }

    private ParserConfigArgs() {
        this.allowNullHeader = Output.empty();
        this.schema = Output.empty();
        this.segmentTerminator = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParserConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowNullHeader;
        private @Nullable Output<SchemaPackageArgs> schema;
        private @Nullable Output<String> segmentTerminator;
        private @Nullable Output<ParserConfigVersion> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ParserConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowNullHeader = defaults.allowNullHeader;
    	      this.schema = defaults.schema;
    	      this.segmentTerminator = defaults.segmentTerminator;
    	      this.version = defaults.version;
        }

        public Builder allowNullHeader(@Nullable Output<Boolean> allowNullHeader) {
            this.allowNullHeader = allowNullHeader;
            return this;
        }

        public Builder allowNullHeader(@Nullable Boolean allowNullHeader) {
            this.allowNullHeader = Output.ofNullable(allowNullHeader);
            return this;
        }

        public Builder schema(@Nullable Output<SchemaPackageArgs> schema) {
            this.schema = schema;
            return this;
        }

        public Builder schema(@Nullable SchemaPackageArgs schema) {
            this.schema = Output.ofNullable(schema);
            return this;
        }

        public Builder segmentTerminator(@Nullable Output<String> segmentTerminator) {
            this.segmentTerminator = segmentTerminator;
            return this;
        }

        public Builder segmentTerminator(@Nullable String segmentTerminator) {
            this.segmentTerminator = Output.ofNullable(segmentTerminator);
            return this;
        }

        public Builder version(@Nullable Output<ParserConfigVersion> version) {
            this.version = version;
            return this;
        }

        public Builder version(@Nullable ParserConfigVersion version) {
            this.version = Output.ofNullable(version);
            return this;
        }
        public ParserConfigArgs build() {
            return new ParserConfigArgs(allowNullHeader, schema, segmentTerminator, version);
        }
    }
}
