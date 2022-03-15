// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.azurenative.dataprotection.inputs.RetentionTagResponse;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Adhoc backup tagging criteria
 * 
 */
public final class AdhocBasedTaggingCriteriaResponse extends io.pulumi.resources.InvokeArgs {

    public static final AdhocBasedTaggingCriteriaResponse Empty = new AdhocBasedTaggingCriteriaResponse();

    /**
     * Retention tag information
     * 
     */
    @Import(name="tagInfo")
      private final @Nullable RetentionTagResponse tagInfo;

    public Optional<RetentionTagResponse> getTagInfo() {
        return this.tagInfo == null ? Optional.empty() : Optional.ofNullable(this.tagInfo);
    }

    public AdhocBasedTaggingCriteriaResponse(@Nullable RetentionTagResponse tagInfo) {
        this.tagInfo = tagInfo;
    }

    private AdhocBasedTaggingCriteriaResponse() {
        this.tagInfo = null;
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

        public Builder tagInfo(@Nullable RetentionTagResponse tagInfo) {
            this.tagInfo = tagInfo;
            return this;
        }
        public AdhocBasedTaggingCriteriaResponse build() {
            return new AdhocBasedTaggingCriteriaResponse(tagInfo);
        }
    }
}
