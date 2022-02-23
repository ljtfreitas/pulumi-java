// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ivs.outputs;

import io.pulumi.awsnative.ivs.outputs.StreamKeyTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetStreamKeyResult {
    /**
     * Stream Key ARN is automatically generated on creation and assigned as the unique identifier.
     * 
     */
    private final @Nullable String arn;
    /**
     * A list of key-value pairs that contain metadata for the asset model.
     * 
     */
    private final @Nullable List<StreamKeyTag> tags;
    /**
     * Stream-key value.
     * 
     */
    private final @Nullable String value;

    @OutputCustomType.Constructor({"arn","tags","value"})
    private GetStreamKeyResult(
        @Nullable String arn,
        @Nullable List<StreamKeyTag> tags,
        @Nullable String value) {
        this.arn = arn;
        this.tags = tags;
        this.value = value;
    }

    /**
     * Stream Key ARN is automatically generated on creation and assigned as the unique identifier.
     * 
     */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * A list of key-value pairs that contain metadata for the asset model.
     * 
     */
    public List<StreamKeyTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * Stream-key value.
     * 
     */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreamKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable List<StreamKeyTag> tags;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStreamKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.tags = defaults.tags;
    	      this.value = defaults.value;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setTags(@Nullable List<StreamKeyTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }
        public GetStreamKeyResult build() {
            return new GetStreamKeyResult(arn, tags, value);
        }
    }
}
