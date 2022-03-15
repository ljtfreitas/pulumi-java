// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterConfigSecurityConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigSecurityConfigArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigSecurityConfigArgs();

    /**
     * Kerberos related configuration.
     * 
     */
    @Import(name="kerberosConfig")
      private final @Nullable Output<WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigArgs> kerberosConfig;

    public Output<WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigArgs> getKerberosConfig() {
        return this.kerberosConfig == null ? Output.empty() : this.kerberosConfig;
    }

    public WorkflowTemplatePlacementManagedClusterConfigSecurityConfigArgs(@Nullable Output<WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigArgs> kerberosConfig) {
        this.kerberosConfig = kerberosConfig;
    }

    private WorkflowTemplatePlacementManagedClusterConfigSecurityConfigArgs() {
        this.kerberosConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigSecurityConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigArgs> kerberosConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigSecurityConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kerberosConfig = defaults.kerberosConfig;
        }

        public Builder kerberosConfig(@Nullable Output<WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigArgs> kerberosConfig) {
            this.kerberosConfig = kerberosConfig;
            return this;
        }

        public Builder kerberosConfig(@Nullable WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigArgs kerberosConfig) {
            this.kerberosConfig = Output.ofNullable(kerberosConfig);
            return this;
        }
        public WorkflowTemplatePlacementManagedClusterConfigSecurityConfigArgs build() {
            return new WorkflowTemplatePlacementManagedClusterConfigSecurityConfigArgs(kerberosConfig);
        }
    }
}
