// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class WorkflowTemplatePlacementManagedClusterConfigMetastoreConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigMetastoreConfigGetArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigMetastoreConfigGetArgs();

    /**
     * Required. Resource name of an existing Dataproc Metastore service. Example: * `projects/`
     * 
     */
    @Import(name="dataprocMetastoreService", required=true)
      private final Output<String> dataprocMetastoreService;

    public Output<String> dataprocMetastoreService() {
        return this.dataprocMetastoreService;
    }

    public WorkflowTemplatePlacementManagedClusterConfigMetastoreConfigGetArgs(Output<String> dataprocMetastoreService) {
        this.dataprocMetastoreService = Objects.requireNonNull(dataprocMetastoreService, "expected parameter 'dataprocMetastoreService' to be non-null");
    }

    private WorkflowTemplatePlacementManagedClusterConfigMetastoreConfigGetArgs() {
        this.dataprocMetastoreService = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigMetastoreConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> dataprocMetastoreService;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigMetastoreConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataprocMetastoreService = defaults.dataprocMetastoreService;
        }

        public Builder dataprocMetastoreService(Output<String> dataprocMetastoreService) {
            this.dataprocMetastoreService = Objects.requireNonNull(dataprocMetastoreService);
            return this;
        }
        public Builder dataprocMetastoreService(String dataprocMetastoreService) {
            this.dataprocMetastoreService = Output.of(Objects.requireNonNull(dataprocMetastoreService));
            return this;
        }        public WorkflowTemplatePlacementManagedClusterConfigMetastoreConfigGetArgs build() {
            return new WorkflowTemplatePlacementManagedClusterConfigMetastoreConfigGetArgs(dataprocMetastoreService);
        }
    }
}
