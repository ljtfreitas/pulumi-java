// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.InputDataBindingResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.MpiResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.OutputDataBindingResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.PyTorchResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.TensorFlowResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TrialComponentResponse {
    /**
     * ARM resource ID of the code asset.
     * 
     */
    private final @Nullable String codeId;
    /**
     * The command to execute on startup of the job. eg. "python train.py"
     * 
     */
    private final String command;
    /**
     * Distribution configuration of the job. If set, this should be one of Mpi, Tensorflow, PyTorch, or null.
     * 
     */
    private final @Nullable Object distribution;
    /**
     * The ARM resource ID of the Environment specification for the job.
     * 
     */
    private final @Nullable String environmentId;
    /**
     * Environment variables included in the job.
     * 
     */
    private final @Nullable Map<String,String> environmentVariables;
    /**
     * Mapping of input data bindings used in the job.
     * 
     */
    private final @Nullable Map<String,InputDataBindingResponse> inputDataBindings;
    /**
     * Mapping of output data bindings used in the job.
     * 
     */
    private final @Nullable Map<String,OutputDataBindingResponse> outputDataBindings;
    /**
     * The max run duration in ISO 8601 format, after which the trial component will be cancelled.
     * Only supports duration with precision as low as Seconds.
     * 
     */
    private final @Nullable String timeout;

    @CustomType.Constructor
    private TrialComponentResponse(
        @CustomType.Parameter("codeId") @Nullable String codeId,
        @CustomType.Parameter("command") String command,
        @CustomType.Parameter("distribution") @Nullable Object distribution,
        @CustomType.Parameter("environmentId") @Nullable String environmentId,
        @CustomType.Parameter("environmentVariables") @Nullable Map<String,String> environmentVariables,
        @CustomType.Parameter("inputDataBindings") @Nullable Map<String,InputDataBindingResponse> inputDataBindings,
        @CustomType.Parameter("outputDataBindings") @Nullable Map<String,OutputDataBindingResponse> outputDataBindings,
        @CustomType.Parameter("timeout") @Nullable String timeout) {
        this.codeId = codeId;
        this.command = command;
        this.distribution = distribution;
        this.environmentId = environmentId;
        this.environmentVariables = environmentVariables;
        this.inputDataBindings = inputDataBindings;
        this.outputDataBindings = outputDataBindings;
        this.timeout = timeout;
    }

    /**
     * ARM resource ID of the code asset.
     * 
    */
    public Optional<String> getCodeId() {
        return Optional.ofNullable(this.codeId);
    }
    /**
     * The command to execute on startup of the job. eg. "python train.py"
     * 
    */
    public String getCommand() {
        return this.command;
    }
    /**
     * Distribution configuration of the job. If set, this should be one of Mpi, Tensorflow, PyTorch, or null.
     * 
    */
    public Optional<Object> getDistribution() {
        return Optional.ofNullable(this.distribution);
    }
    /**
     * The ARM resource ID of the Environment specification for the job.
     * 
    */
    public Optional<String> getEnvironmentId() {
        return Optional.ofNullable(this.environmentId);
    }
    /**
     * Environment variables included in the job.
     * 
    */
    public Map<String,String> getEnvironmentVariables() {
        return this.environmentVariables == null ? Map.of() : this.environmentVariables;
    }
    /**
     * Mapping of input data bindings used in the job.
     * 
    */
    public Map<String,InputDataBindingResponse> getInputDataBindings() {
        return this.inputDataBindings == null ? Map.of() : this.inputDataBindings;
    }
    /**
     * Mapping of output data bindings used in the job.
     * 
    */
    public Map<String,OutputDataBindingResponse> getOutputDataBindings() {
        return this.outputDataBindings == null ? Map.of() : this.outputDataBindings;
    }
    /**
     * The max run duration in ISO 8601 format, after which the trial component will be cancelled.
     * Only supports duration with precision as low as Seconds.
     * 
    */
    public Optional<String> getTimeout() {
        return Optional.ofNullable(this.timeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrialComponentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String codeId;
        private String command;
        private @Nullable Object distribution;
        private @Nullable String environmentId;
        private @Nullable Map<String,String> environmentVariables;
        private @Nullable Map<String,InputDataBindingResponse> inputDataBindings;
        private @Nullable Map<String,OutputDataBindingResponse> outputDataBindings;
        private @Nullable String timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(TrialComponentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeId = defaults.codeId;
    	      this.command = defaults.command;
    	      this.distribution = defaults.distribution;
    	      this.environmentId = defaults.environmentId;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.inputDataBindings = defaults.inputDataBindings;
    	      this.outputDataBindings = defaults.outputDataBindings;
    	      this.timeout = defaults.timeout;
        }

        public Builder codeId(@Nullable String codeId) {
            this.codeId = codeId;
            return this;
        }

        public Builder command(String command) {
            this.command = Objects.requireNonNull(command);
            return this;
        }

        public Builder distribution(@Nullable Object distribution) {
            this.distribution = distribution;
            return this;
        }

        public Builder environmentId(@Nullable String environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        public Builder environmentVariables(@Nullable Map<String,String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder inputDataBindings(@Nullable Map<String,InputDataBindingResponse> inputDataBindings) {
            this.inputDataBindings = inputDataBindings;
            return this;
        }

        public Builder outputDataBindings(@Nullable Map<String,OutputDataBindingResponse> outputDataBindings) {
            this.outputDataBindings = outputDataBindings;
            return this;
        }

        public Builder timeout(@Nullable String timeout) {
            this.timeout = timeout;
            return this;
        }
        public TrialComponentResponse build() {
            return new TrialComponentResponse(codeId, command, distribution, environmentId, environmentVariables, inputDataBindings, outputDataBindings, timeout);
        }
    }
}
