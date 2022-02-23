// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BigTableIODetailsResponse {
    /**
     * InstanceId accessed in the connection.
     * 
     */
    private final String instanceId;
    /**
     * ProjectId accessed in the connection.
     * 
     */
    private final String project;
    /**
     * TableId accessed in the connection.
     * 
     */
    private final String tableId;

    @OutputCustomType.Constructor({"instanceId","project","tableId"})
    private BigTableIODetailsResponse(
        String instanceId,
        String project,
        String tableId) {
        this.instanceId = Objects.requireNonNull(instanceId);
        this.project = Objects.requireNonNull(project);
        this.tableId = Objects.requireNonNull(tableId);
    }

    /**
     * InstanceId accessed in the connection.
     * 
     */
    public String getInstanceId() {
        return this.instanceId;
    }
    /**
     * ProjectId accessed in the connection.
     * 
     */
    public String getProject() {
        return this.project;
    }
    /**
     * TableId accessed in the connection.
     * 
     */
    public String getTableId() {
        return this.tableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BigTableIODetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceId;
        private String project;
        private String tableId;

        public Builder() {
    	      // Empty
        }

        public Builder(BigTableIODetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceId = defaults.instanceId;
    	      this.project = defaults.project;
    	      this.tableId = defaults.tableId;
        }

        public Builder setInstanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setTableId(String tableId) {
            this.tableId = Objects.requireNonNull(tableId);
            return this;
        }
        public BigTableIODetailsResponse build() {
            return new BigTableIODetailsResponse(instanceId, project, tableId);
        }
    }
}
