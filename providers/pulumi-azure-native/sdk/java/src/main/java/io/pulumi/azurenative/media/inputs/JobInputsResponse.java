// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.JobInputAssetResponse;
import io.pulumi.azurenative.media.inputs.JobInputClipResponse;
import io.pulumi.azurenative.media.inputs.JobInputHttpResponse;
import io.pulumi.azurenative.media.inputs.JobInputSequenceResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a list of inputs to a Job.
 * 
 */
public final class JobInputsResponse extends io.pulumi.resources.InvokeArgs {

    public static final JobInputsResponse Empty = new JobInputsResponse();

    /**
     * List of inputs to a Job.
     * 
     */
    @InputImport(name="inputs")
        private final @Nullable List<Object> inputs;

    public List<Object> getInputs() {
        return this.inputs == null ? List.of() : this.inputs;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.JobInputs'.
     * 
     */
    @InputImport(name="odataType", required=true)
        private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    public JobInputsResponse(
        @Nullable List<Object> inputs,
        String odataType) {
        this.inputs = inputs;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private JobInputsResponse() {
        this.inputs = List.of();
        this.odataType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobInputsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> inputs;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(JobInputsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputs = defaults.inputs;
    	      this.odataType = defaults.odataType;
        }

        public Builder setInputs(@Nullable List<Object> inputs) {
            this.inputs = inputs;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public JobInputsResponse build() {
            return new JobInputsResponse(inputs, odataType);
        }
    }
}
