// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.azurenative.security.inputs.JitNetworkAccessRequestVirtualMachineResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JitNetworkAccessRequestResponse extends io.pulumi.resources.InvokeArgs {

    public static final JitNetworkAccessRequestResponse Empty = new JitNetworkAccessRequestResponse();

    /**
     * The justification for making the initiate request
     * 
     */
    @InputImport(name="justification")
    private final @Nullable String justification;

    public Optional<String> getJustification() {
        return this.justification == null ? Optional.empty() : Optional.ofNullable(this.justification);
    }

    /**
     * The identity of the person who made the request
     * 
     */
    @InputImport(name="requestor", required=true)
    private final String requestor;

    public String getRequestor() {
        return this.requestor;
    }

    /**
     * The start time of the request in UTC
     * 
     */
    @InputImport(name="startTimeUtc", required=true)
    private final String startTimeUtc;

    public String getStartTimeUtc() {
        return this.startTimeUtc;
    }

    @InputImport(name="virtualMachines", required=true)
    private final List<JitNetworkAccessRequestVirtualMachineResponse> virtualMachines;

    public List<JitNetworkAccessRequestVirtualMachineResponse> getVirtualMachines() {
        return this.virtualMachines;
    }

    public JitNetworkAccessRequestResponse(
        @Nullable String justification,
        String requestor,
        String startTimeUtc,
        List<JitNetworkAccessRequestVirtualMachineResponse> virtualMachines) {
        this.justification = justification;
        this.requestor = Objects.requireNonNull(requestor, "expected parameter 'requestor' to be non-null");
        this.startTimeUtc = Objects.requireNonNull(startTimeUtc, "expected parameter 'startTimeUtc' to be non-null");
        this.virtualMachines = Objects.requireNonNull(virtualMachines, "expected parameter 'virtualMachines' to be non-null");
    }

    private JitNetworkAccessRequestResponse() {
        this.justification = null;
        this.requestor = null;
        this.startTimeUtc = null;
        this.virtualMachines = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JitNetworkAccessRequestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String justification;
        private String requestor;
        private String startTimeUtc;
        private List<JitNetworkAccessRequestVirtualMachineResponse> virtualMachines;

        public Builder() {
    	      // Empty
        }

        public Builder(JitNetworkAccessRequestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.justification = defaults.justification;
    	      this.requestor = defaults.requestor;
    	      this.startTimeUtc = defaults.startTimeUtc;
    	      this.virtualMachines = defaults.virtualMachines;
        }

        public Builder setJustification(@Nullable String justification) {
            this.justification = justification;
            return this;
        }

        public Builder setRequestor(String requestor) {
            this.requestor = Objects.requireNonNull(requestor);
            return this;
        }

        public Builder setStartTimeUtc(String startTimeUtc) {
            this.startTimeUtc = Objects.requireNonNull(startTimeUtc);
            return this;
        }

        public Builder setVirtualMachines(List<JitNetworkAccessRequestVirtualMachineResponse> virtualMachines) {
            this.virtualMachines = Objects.requireNonNull(virtualMachines);
            return this;
        }

        public JitNetworkAccessRequestResponse build() {
            return new JitNetworkAccessRequestResponse(justification, requestor, startTimeUtc, virtualMachines);
        }
    }
}
