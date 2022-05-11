// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobInputAsset {
    /**
     * @return A label that is assigned to a JobInputClip, that is used to satisfy a reference used in the Transform. For example, a Transform can be authored so as to take an image file with the label &#39;xyz&#39; and apply it as an overlay onto the input video before it is encoded. When submitting a Job, exactly one of the JobInputs should be the image file, and it should have the label &#39;xyz&#39;.
     * 
     */
    private final @Nullable String label;
    /**
     * @return The name of the input Asset. Changing this forces a new Media Job to be created.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private JobInputAsset(
        @CustomType.Parameter("label") @Nullable String label,
        @CustomType.Parameter("name") String name) {
        this.label = label;
        this.name = name;
    }

    /**
     * @return A label that is assigned to a JobInputClip, that is used to satisfy a reference used in the Transform. For example, a Transform can be authored so as to take an image file with the label &#39;xyz&#39; and apply it as an overlay onto the input video before it is encoded. When submitting a Job, exactly one of the JobInputs should be the image file, and it should have the label &#39;xyz&#39;.
     * 
     */
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }
    /**
     * @return The name of the input Asset. Changing this forces a new Media Job to be created.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobInputAsset defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String label;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(JobInputAsset defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.label = defaults.label;
    	      this.name = defaults.name;
        }

        public Builder label(@Nullable String label) {
            this.label = label;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public JobInputAsset build() {
            return new JobInputAsset(label, name);
        }
    }
}
