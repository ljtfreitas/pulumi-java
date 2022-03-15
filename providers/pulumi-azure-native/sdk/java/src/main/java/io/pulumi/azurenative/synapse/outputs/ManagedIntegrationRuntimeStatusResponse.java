// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.azurenative.synapse.outputs.ManagedIntegrationRuntimeErrorResponse;
import io.pulumi.azurenative.synapse.outputs.ManagedIntegrationRuntimeNodeResponse;
import io.pulumi.azurenative.synapse.outputs.ManagedIntegrationRuntimeOperationResultResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ManagedIntegrationRuntimeStatusResponse {
    /**
     * The time at which the integration runtime was created, in ISO8601 format.
     * 
     */
    private final String createTime;
    /**
     * The workspace name which the integration runtime belong to.
     * 
     */
    private final String dataFactoryName;
    /**
     * The last operation result that occurred on this integration runtime.
     * 
     */
    private final ManagedIntegrationRuntimeOperationResultResponse lastOperation;
    /**
     * The list of nodes for managed integration runtime.
     * 
     */
    private final List<ManagedIntegrationRuntimeNodeResponse> nodes;
    /**
     * The errors that occurred on this integration runtime.
     * 
     */
    private final List<ManagedIntegrationRuntimeErrorResponse> otherErrors;
    /**
     * The state of integration runtime.
     * 
     */
    private final String state;
    /**
     * The type of integration runtime.
     * Expected value is 'Managed'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ManagedIntegrationRuntimeStatusResponse(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("dataFactoryName") String dataFactoryName,
        @CustomType.Parameter("lastOperation") ManagedIntegrationRuntimeOperationResultResponse lastOperation,
        @CustomType.Parameter("nodes") List<ManagedIntegrationRuntimeNodeResponse> nodes,
        @CustomType.Parameter("otherErrors") List<ManagedIntegrationRuntimeErrorResponse> otherErrors,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("type") String type) {
        this.createTime = createTime;
        this.dataFactoryName = dataFactoryName;
        this.lastOperation = lastOperation;
        this.nodes = nodes;
        this.otherErrors = otherErrors;
        this.state = state;
        this.type = type;
    }

    /**
     * The time at which the integration runtime was created, in ISO8601 format.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The workspace name which the integration runtime belong to.
     * 
    */
    public String getDataFactoryName() {
        return this.dataFactoryName;
    }
    /**
     * The last operation result that occurred on this integration runtime.
     * 
    */
    public ManagedIntegrationRuntimeOperationResultResponse getLastOperation() {
        return this.lastOperation;
    }
    /**
     * The list of nodes for managed integration runtime.
     * 
    */
    public List<ManagedIntegrationRuntimeNodeResponse> getNodes() {
        return this.nodes;
    }
    /**
     * The errors that occurred on this integration runtime.
     * 
    */
    public List<ManagedIntegrationRuntimeErrorResponse> getOtherErrors() {
        return this.otherErrors;
    }
    /**
     * The state of integration runtime.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * The type of integration runtime.
     * Expected value is 'Managed'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedIntegrationRuntimeStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String dataFactoryName;
        private ManagedIntegrationRuntimeOperationResultResponse lastOperation;
        private List<ManagedIntegrationRuntimeNodeResponse> nodes;
        private List<ManagedIntegrationRuntimeErrorResponse> otherErrors;
        private String state;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedIntegrationRuntimeStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.dataFactoryName = defaults.dataFactoryName;
    	      this.lastOperation = defaults.lastOperation;
    	      this.nodes = defaults.nodes;
    	      this.otherErrors = defaults.otherErrors;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder dataFactoryName(String dataFactoryName) {
            this.dataFactoryName = Objects.requireNonNull(dataFactoryName);
            return this;
        }

        public Builder lastOperation(ManagedIntegrationRuntimeOperationResultResponse lastOperation) {
            this.lastOperation = Objects.requireNonNull(lastOperation);
            return this;
        }

        public Builder nodes(List<ManagedIntegrationRuntimeNodeResponse> nodes) {
            this.nodes = Objects.requireNonNull(nodes);
            return this;
        }

        public Builder otherErrors(List<ManagedIntegrationRuntimeErrorResponse> otherErrors) {
            this.otherErrors = Objects.requireNonNull(otherErrors);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ManagedIntegrationRuntimeStatusResponse build() {
            return new ManagedIntegrationRuntimeStatusResponse(createTime, dataFactoryName, lastOperation, nodes, otherErrors, state, type);
        }
    }
}
