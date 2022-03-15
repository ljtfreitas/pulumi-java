// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class IndexJsonTokenTypeConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final IndexJsonTokenTypeConfiguration Empty = new IndexJsonTokenTypeConfiguration();

    @Import(name="groupAttributeField", required=true)
      private final String groupAttributeField;

    public String getGroupAttributeField() {
        return this.groupAttributeField;
    }

    @Import(name="userNameAttributeField", required=true)
      private final String userNameAttributeField;

    public String getUserNameAttributeField() {
        return this.userNameAttributeField;
    }

    public IndexJsonTokenTypeConfiguration(
        String groupAttributeField,
        String userNameAttributeField) {
        this.groupAttributeField = Objects.requireNonNull(groupAttributeField, "expected parameter 'groupAttributeField' to be non-null");
        this.userNameAttributeField = Objects.requireNonNull(userNameAttributeField, "expected parameter 'userNameAttributeField' to be non-null");
    }

    private IndexJsonTokenTypeConfiguration() {
        this.groupAttributeField = null;
        this.userNameAttributeField = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IndexJsonTokenTypeConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String groupAttributeField;
        private String userNameAttributeField;

        public Builder() {
    	      // Empty
        }

        public Builder(IndexJsonTokenTypeConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupAttributeField = defaults.groupAttributeField;
    	      this.userNameAttributeField = defaults.userNameAttributeField;
        }

        public Builder groupAttributeField(String groupAttributeField) {
            this.groupAttributeField = Objects.requireNonNull(groupAttributeField);
            return this;
        }

        public Builder userNameAttributeField(String userNameAttributeField) {
            this.userNameAttributeField = Objects.requireNonNull(userNameAttributeField);
            return this;
        }
        public IndexJsonTokenTypeConfiguration build() {
            return new IndexJsonTokenTypeConfiguration(groupAttributeField, userNameAttributeField);
        }
    }
}
