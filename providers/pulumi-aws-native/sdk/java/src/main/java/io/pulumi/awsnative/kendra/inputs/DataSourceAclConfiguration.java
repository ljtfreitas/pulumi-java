// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DataSourceAclConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceAclConfiguration Empty = new DataSourceAclConfiguration();

    @Import(name="allowedGroupsColumnName", required=true)
      private final String allowedGroupsColumnName;

    public String getAllowedGroupsColumnName() {
        return this.allowedGroupsColumnName;
    }

    public DataSourceAclConfiguration(String allowedGroupsColumnName) {
        this.allowedGroupsColumnName = Objects.requireNonNull(allowedGroupsColumnName, "expected parameter 'allowedGroupsColumnName' to be non-null");
    }

    private DataSourceAclConfiguration() {
        this.allowedGroupsColumnName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceAclConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String allowedGroupsColumnName;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceAclConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedGroupsColumnName = defaults.allowedGroupsColumnName;
        }

        public Builder allowedGroupsColumnName(String allowedGroupsColumnName) {
            this.allowedGroupsColumnName = Objects.requireNonNull(allowedGroupsColumnName);
            return this;
        }
        public DataSourceAclConfiguration build() {
            return new DataSourceAclConfiguration(allowedGroupsColumnName);
        }
    }
}
