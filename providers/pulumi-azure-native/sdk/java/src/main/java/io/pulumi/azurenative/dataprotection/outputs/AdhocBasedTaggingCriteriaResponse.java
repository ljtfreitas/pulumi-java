// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.outputs;

import io.pulumi.azurenative.dataprotection.outputs.RetentionTagResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AdhocBasedTaggingCriteriaResponse {
    /**
     * Retention tag information
     * 
     */
    private final @Nullable RetentionTagResponse tagInfo;

    @OutputCustomType.Constructor({"tagInfo"})
    private AdhocBasedTaggingCriteriaResponse(@Nullable RetentionTagResponse tagInfo) {
        this.tagInfo = tagInfo;
    }

    /**
     * Retention tag information
     * 
     */
    public Optional<RetentionTagResponse> getTagInfo() {
        return Optional.ofNullable(this.tagInfo);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdhocBasedTaggingCriteriaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RetentionTagResponse tagInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(AdhocBasedTaggingCriteriaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tagInfo = defaults.tagInfo;
        }

        public Builder setTagInfo(@Nullable RetentionTagResponse tagInfo) {
            this.tagInfo = tagInfo;
            return this;
        }
        public AdhocBasedTaggingCriteriaResponse build() {
            return new AdhocBasedTaggingCriteriaResponse(tagInfo);
        }
    }
}
