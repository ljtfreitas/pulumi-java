// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class OnPremiseResourceDetailsResponse {
    /**
     * The name of the machine
     * 
     */
    private final String machineName;
    /**
     * The platform where the assessed resource resides
     * Expected value is 'OnPremise'.
     * 
     */
    private final String source;
    /**
     * The oms agent Id installed on the machine
     * 
     */
    private final String sourceComputerId;
    /**
     * The unique Id of the machine
     * 
     */
    private final String vmuuid;
    /**
     * Azure resource Id of the workspace the machine is attached to
     * 
     */
    private final String workspaceId;

    @OutputCustomType.Constructor({"machineName","source","sourceComputerId","vmuuid","workspaceId"})
    private OnPremiseResourceDetailsResponse(
        String machineName,
        String source,
        String sourceComputerId,
        String vmuuid,
        String workspaceId) {
        this.machineName = Objects.requireNonNull(machineName);
        this.source = Objects.requireNonNull(source);
        this.sourceComputerId = Objects.requireNonNull(sourceComputerId);
        this.vmuuid = Objects.requireNonNull(vmuuid);
        this.workspaceId = Objects.requireNonNull(workspaceId);
    }

    /**
     * The name of the machine
     * 
     */
    public String getMachineName() {
        return this.machineName;
    }
    /**
     * The platform where the assessed resource resides
     * Expected value is 'OnPremise'.
     * 
     */
    public String getSource() {
        return this.source;
    }
    /**
     * The oms agent Id installed on the machine
     * 
     */
    public String getSourceComputerId() {
        return this.sourceComputerId;
    }
    /**
     * The unique Id of the machine
     * 
     */
    public String getVmuuid() {
        return this.vmuuid;
    }
    /**
     * Azure resource Id of the workspace the machine is attached to
     * 
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OnPremiseResourceDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String machineName;
        private String source;
        private String sourceComputerId;
        private String vmuuid;
        private String workspaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(OnPremiseResourceDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.machineName = defaults.machineName;
    	      this.source = defaults.source;
    	      this.sourceComputerId = defaults.sourceComputerId;
    	      this.vmuuid = defaults.vmuuid;
    	      this.workspaceId = defaults.workspaceId;
        }

        public Builder setMachineName(String machineName) {
            this.machineName = Objects.requireNonNull(machineName);
            return this;
        }

        public Builder setSource(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setSourceComputerId(String sourceComputerId) {
            this.sourceComputerId = Objects.requireNonNull(sourceComputerId);
            return this;
        }

        public Builder setVmuuid(String vmuuid) {
            this.vmuuid = Objects.requireNonNull(vmuuid);
            return this;
        }

        public Builder setWorkspaceId(String workspaceId) {
            this.workspaceId = Objects.requireNonNull(workspaceId);
            return this;
        }

        public OnPremiseResourceDetailsResponse build() {
            return new OnPremiseResourceDetailsResponse(machineName, source, sourceComputerId, vmuuid, workspaceId);
        }
    }
}
