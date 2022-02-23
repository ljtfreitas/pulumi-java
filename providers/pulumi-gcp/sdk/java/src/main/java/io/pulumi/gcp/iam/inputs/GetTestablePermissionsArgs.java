// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iam.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTestablePermissionsArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTestablePermissionsArgs Empty = new GetTestablePermissionsArgs();

    /**
     * The level of support for custom roles. Can be one of `"NOT_SUPPORTED"`, `"SUPPORTED"`, `"TESTING"`. Default is `"SUPPORTED"`
     * 
     */
    @InputImport(name="customSupportLevel")
        private final @Nullable String customSupportLevel;

    public Optional<String> getCustomSupportLevel() {
        return this.customSupportLevel == null ? Optional.empty() : Optional.ofNullable(this.customSupportLevel);
    }

    /**
     * See [full resource name documentation](https://cloud.google.com/apis/design/resource_names#full_resource_name) for more detail.
     * 
     */
    @InputImport(name="fullResourceName", required=true)
        private final String fullResourceName;

    public String getFullResourceName() {
        return this.fullResourceName;
    }

    /**
     * The acceptable release stages of the permission in the output. Note that `BETA` does not include permissions in `GA`, but you can specify both with `["GA", "BETA"]` for example. Can be a list of `"ALPHA"`, `"BETA"`, `"GA"`, `"DEPRECATED"`. Default is `["GA"]`.
     * 
     */
    @InputImport(name="stages")
        private final @Nullable List<String> stages;

    public List<String> getStages() {
        return this.stages == null ? List.of() : this.stages;
    }

    public GetTestablePermissionsArgs(
        @Nullable String customSupportLevel,
        String fullResourceName,
        @Nullable List<String> stages) {
        this.customSupportLevel = customSupportLevel;
        this.fullResourceName = Objects.requireNonNull(fullResourceName, "expected parameter 'fullResourceName' to be non-null");
        this.stages = stages;
    }

    private GetTestablePermissionsArgs() {
        this.customSupportLevel = null;
        this.fullResourceName = null;
        this.stages = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTestablePermissionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String customSupportLevel;
        private String fullResourceName;
        private @Nullable List<String> stages;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTestablePermissionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customSupportLevel = defaults.customSupportLevel;
    	      this.fullResourceName = defaults.fullResourceName;
    	      this.stages = defaults.stages;
        }

        public Builder setCustomSupportLevel(@Nullable String customSupportLevel) {
            this.customSupportLevel = customSupportLevel;
            return this;
        }

        public Builder setFullResourceName(String fullResourceName) {
            this.fullResourceName = Objects.requireNonNull(fullResourceName);
            return this;
        }

        public Builder setStages(@Nullable List<String> stages) {
            this.stages = stages;
            return this;
        }
        public GetTestablePermissionsArgs build() {
            return new GetTestablePermissionsArgs(customSupportLevel, fullResourceName, stages);
        }
    }
}
