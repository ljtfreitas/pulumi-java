// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderArgs Empty = new EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderArgs();

    /**
     * The CSV content type headers to capture.
     * 
     */
    @Import(name="csvContentTypes")
      private final @Nullable Output<List<String>> csvContentTypes;

    public Output<List<String>> getCsvContentTypes() {
        return this.csvContentTypes == null ? Output.empty() : this.csvContentTypes;
    }

    /**
     * The JSON content type headers to capture.
     * 
     */
    @Import(name="jsonContentTypes")
      private final @Nullable Output<List<String>> jsonContentTypes;

    public Output<List<String>> getJsonContentTypes() {
        return this.jsonContentTypes == null ? Output.empty() : this.jsonContentTypes;
    }

    public EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderArgs(
        @Nullable Output<List<String>> csvContentTypes,
        @Nullable Output<List<String>> jsonContentTypes) {
        this.csvContentTypes = csvContentTypes;
        this.jsonContentTypes = jsonContentTypes;
    }

    private EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderArgs() {
        this.csvContentTypes = Output.empty();
        this.jsonContentTypes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> csvContentTypes;
        private @Nullable Output<List<String>> jsonContentTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.csvContentTypes = defaults.csvContentTypes;
    	      this.jsonContentTypes = defaults.jsonContentTypes;
        }

        public Builder csvContentTypes(@Nullable Output<List<String>> csvContentTypes) {
            this.csvContentTypes = csvContentTypes;
            return this;
        }

        public Builder csvContentTypes(@Nullable List<String> csvContentTypes) {
            this.csvContentTypes = Output.ofNullable(csvContentTypes);
            return this;
        }

        public Builder jsonContentTypes(@Nullable Output<List<String>> jsonContentTypes) {
            this.jsonContentTypes = jsonContentTypes;
            return this;
        }

        public Builder jsonContentTypes(@Nullable List<String> jsonContentTypes) {
            this.jsonContentTypes = Output.ofNullable(jsonContentTypes);
            return this;
        }
        public EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderArgs build() {
            return new EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderArgs(csvContentTypes, jsonContentTypes);
        }
    }
}
