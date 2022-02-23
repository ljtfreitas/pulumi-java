// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyTagArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyTagArgs Empty = new PolicyTagArgs();

    /**
     * Description of this policy tag. It must: contain only unicode characters, tabs,
     * newlines, carriage returns and page breaks; and be at most 2000 bytes long when
     * encoded in UTF-8. If not set, defaults to an empty description.
     * If not set, defaults to an empty description.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * User defined name of this policy tag. It must: be unique within the parent
     * taxonomy; contain only unicode letters, numbers, underscores, dashes and spaces;
     * not start or end with spaces; and be at most 200 bytes long when encoded in UTF-8.
     * 
     */
    @InputImport(name="displayName", required=true)
        private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Resource name of this policy tag's parent policy tag.
     * If empty, it means this policy tag is a top level policy tag.
     * If not set, defaults to an empty string.
     * 
     */
    @InputImport(name="parentPolicyTag")
        private final @Nullable Input<String> parentPolicyTag;

    public Input<String> getParentPolicyTag() {
        return this.parentPolicyTag == null ? Input.empty() : this.parentPolicyTag;
    }

    /**
     * Taxonomy the policy tag is associated with
     * 
     */
    @InputImport(name="taxonomy", required=true)
        private final Input<String> taxonomy;

    public Input<String> getTaxonomy() {
        return this.taxonomy;
    }

    public PolicyTagArgs(
        @Nullable Input<String> description,
        Input<String> displayName,
        @Nullable Input<String> parentPolicyTag,
        Input<String> taxonomy) {
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.parentPolicyTag = parentPolicyTag;
        this.taxonomy = Objects.requireNonNull(taxonomy, "expected parameter 'taxonomy' to be non-null");
    }

    private PolicyTagArgs() {
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.parentPolicyTag = Input.empty();
        this.taxonomy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> displayName;
        private @Nullable Input<String> parentPolicyTag;
        private Input<String> taxonomy;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyTagArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.parentPolicyTag = defaults.parentPolicyTag;
    	      this.taxonomy = defaults.taxonomy;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setParentPolicyTag(@Nullable Input<String> parentPolicyTag) {
            this.parentPolicyTag = parentPolicyTag;
            return this;
        }

        public Builder setParentPolicyTag(@Nullable String parentPolicyTag) {
            this.parentPolicyTag = Input.ofNullable(parentPolicyTag);
            return this;
        }

        public Builder setTaxonomy(Input<String> taxonomy) {
            this.taxonomy = Objects.requireNonNull(taxonomy);
            return this;
        }

        public Builder setTaxonomy(String taxonomy) {
            this.taxonomy = Input.of(Objects.requireNonNull(taxonomy));
            return this;
        }
        public PolicyTagArgs build() {
            return new PolicyTagArgs(description, displayName, parentPolicyTag, taxonomy);
        }
    }
}
