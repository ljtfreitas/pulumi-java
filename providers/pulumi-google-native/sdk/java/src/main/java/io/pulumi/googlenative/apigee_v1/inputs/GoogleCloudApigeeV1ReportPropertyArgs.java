// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1AttributeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GoogleCloudApigeeV1ReportPropertyArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudApigeeV1ReportPropertyArgs Empty = new GoogleCloudApigeeV1ReportPropertyArgs();

    /**
     * name of the property
     * 
     */
    @InputImport(name="property")
      private final @Nullable Input<String> property;

    public Input<String> getProperty() {
        return this.property == null ? Input.empty() : this.property;
    }

    /**
     * property values
     * 
     */
    @InputImport(name="value")
      private final @Nullable Input<List<GoogleCloudApigeeV1AttributeArgs>> value;

    public Input<List<GoogleCloudApigeeV1AttributeArgs>> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public GoogleCloudApigeeV1ReportPropertyArgs(
        @Nullable Input<String> property,
        @Nullable Input<List<GoogleCloudApigeeV1AttributeArgs>> value) {
        this.property = property;
        this.value = value;
    }

    private GoogleCloudApigeeV1ReportPropertyArgs() {
        this.property = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1ReportPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> property;
        private @Nullable Input<List<GoogleCloudApigeeV1AttributeArgs>> value;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1ReportPropertyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.property = defaults.property;
    	      this.value = defaults.value;
        }

        public Builder setProperty(@Nullable Input<String> property) {
            this.property = property;
            return this;
        }

        public Builder setProperty(@Nullable String property) {
            this.property = Input.ofNullable(property);
            return this;
        }

        public Builder setValue(@Nullable Input<List<GoogleCloudApigeeV1AttributeArgs>> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable List<GoogleCloudApigeeV1AttributeArgs> value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public GoogleCloudApigeeV1ReportPropertyArgs build() {
            return new GoogleCloudApigeeV1ReportPropertyArgs(property, value);
        }
    }
}
