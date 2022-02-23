// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.tags.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagValueIamPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final TagValueIamPolicyState Empty = new TagValueIamPolicyState();

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @InputImport(name="etag")
        private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @InputImport(name="policyData")
        private final @Nullable Input<String> policyData;

    public Input<String> getPolicyData() {
        return this.policyData == null ? Input.empty() : this.policyData;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="tagValue")
        private final @Nullable Input<String> tagValue;

    public Input<String> getTagValue() {
        return this.tagValue == null ? Input.empty() : this.tagValue;
    }

    public TagValueIamPolicyState(
        @Nullable Input<String> etag,
        @Nullable Input<String> policyData,
        @Nullable Input<String> tagValue) {
        this.etag = etag;
        this.policyData = policyData;
        this.tagValue = tagValue;
    }

    private TagValueIamPolicyState() {
        this.etag = Input.empty();
        this.policyData = Input.empty();
        this.tagValue = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagValueIamPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> etag;
        private @Nullable Input<String> policyData;
        private @Nullable Input<String> tagValue;

        public Builder() {
    	      // Empty
        }

        public Builder(TagValueIamPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.policyData = defaults.policyData;
    	      this.tagValue = defaults.tagValue;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setPolicyData(@Nullable Input<String> policyData) {
            this.policyData = policyData;
            return this;
        }

        public Builder setPolicyData(@Nullable String policyData) {
            this.policyData = Input.ofNullable(policyData);
            return this;
        }

        public Builder setTagValue(@Nullable Input<String> tagValue) {
            this.tagValue = tagValue;
            return this;
        }

        public Builder setTagValue(@Nullable String tagValue) {
            this.tagValue = Input.ofNullable(tagValue);
            return this;
        }
        public TagValueIamPolicyState build() {
            return new TagValueIamPolicyState(etag, policyData, tagValue);
        }
    }
}
