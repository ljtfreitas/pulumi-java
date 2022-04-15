// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
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
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * User defined name of this policy tag. It must: be unique within the parent
     * taxonomy; contain only unicode letters, numbers, underscores, dashes and spaces;
     * not start or end with spaces; and be at most 200 bytes long when encoded in UTF-8.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Resource name of this policy tag's parent policy tag.
     * If empty, it means this policy tag is a top level policy tag.
     * If not set, defaults to an empty string.
     * 
     */
    @Import(name="parentPolicyTag")
      private final @Nullable Output<String> parentPolicyTag;

    public Output<String> parentPolicyTag() {
        return this.parentPolicyTag == null ? Codegen.empty() : this.parentPolicyTag;
    }

    /**
     * Taxonomy the policy tag is associated with
     * 
     */
    @Import(name="taxonomy", required=true)
      private final Output<String> taxonomy;

    public Output<String> taxonomy() {
        return this.taxonomy;
    }

    public PolicyTagArgs(
        @Nullable Output<String> description,
        Output<String> displayName,
        @Nullable Output<String> parentPolicyTag,
        Output<String> taxonomy) {
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.parentPolicyTag = parentPolicyTag;
        this.taxonomy = Objects.requireNonNull(taxonomy, "expected parameter 'taxonomy' to be non-null");
    }

    private PolicyTagArgs() {
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.parentPolicyTag = Codegen.empty();
        this.taxonomy = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> displayName;
        private @Nullable Output<String> parentPolicyTag;
        private Output<String> taxonomy;

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

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }
        public Builder parentPolicyTag(@Nullable Output<String> parentPolicyTag) {
            this.parentPolicyTag = parentPolicyTag;
            return this;
        }
        public Builder parentPolicyTag(@Nullable String parentPolicyTag) {
            this.parentPolicyTag = Codegen.ofNullable(parentPolicyTag);
            return this;
        }
        public Builder taxonomy(Output<String> taxonomy) {
            this.taxonomy = Objects.requireNonNull(taxonomy);
            return this;
        }
        public Builder taxonomy(String taxonomy) {
            this.taxonomy = Output.of(Objects.requireNonNull(taxonomy));
            return this;
        }        public PolicyTagArgs build() {
            return new PolicyTagArgs(description, displayName, parentPolicyTag, taxonomy);
        }
    }
}
