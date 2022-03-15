// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer;

import io.pulumi.azurenative.videoanalyzer.enums.Kind;
import io.pulumi.azurenative.videoanalyzer.inputs.EncoderProcessorArgs;
import io.pulumi.azurenative.videoanalyzer.inputs.ParameterDeclarationArgs;
import io.pulumi.azurenative.videoanalyzer.inputs.RtspSourceArgs;
import io.pulumi.azurenative.videoanalyzer.inputs.SkuArgs;
import io.pulumi.azurenative.videoanalyzer.inputs.VideoSinkArgs;
import io.pulumi.azurenative.videoanalyzer.inputs.VideoSourceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineTopologyArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineTopologyArgs Empty = new PipelineTopologyArgs();

    /**
     * The Azure Video Analyzer account name.
     * 
     */
    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName;
    }

    /**
     * An optional description of the pipeline topology. It is recommended that the expected use of the topology to be described here.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Topology kind.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<Either<String,Kind>> kind;

    public Output<Either<String,Kind>> getKind() {
        return this.kind;
    }

    /**
     * List of the topology parameter declarations. Parameters declared here can be referenced throughout the topology nodes through the use of "${PARAMETER_NAME}" string pattern. Parameters can have optional default values and can later be defined in individual instances of the pipeline.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<List<ParameterDeclarationArgs>> parameters;

    public Output<List<ParameterDeclarationArgs>> getParameters() {
        return this.parameters == null ? Output.empty() : this.parameters;
    }

    /**
     * Pipeline topology unique identifier.
     * 
     */
    @Import(name="pipelineTopologyName")
      private final @Nullable Output<String> pipelineTopologyName;

    public Output<String> getPipelineTopologyName() {
        return this.pipelineTopologyName == null ? Output.empty() : this.pipelineTopologyName;
    }

    /**
     * List of the topology processor nodes. Processor nodes enable pipeline data to be analyzed, processed or transformed.
     * 
     */
    @Import(name="processors")
      private final @Nullable Output<List<EncoderProcessorArgs>> processors;

    public Output<List<EncoderProcessorArgs>> getProcessors() {
        return this.processors == null ? Output.empty() : this.processors;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * List of the topology sink nodes. Sink nodes allow pipeline data to be stored or exported.
     * 
     */
    @Import(name="sinks", required=true)
      private final Output<List<VideoSinkArgs>> sinks;

    public Output<List<VideoSinkArgs>> getSinks() {
        return this.sinks;
    }

    /**
     * Describes the properties of a SKU.
     * 
     */
    @Import(name="sku", required=true)
      private final Output<SkuArgs> sku;

    public Output<SkuArgs> getSku() {
        return this.sku;
    }

    /**
     * List of the topology source nodes. Source nodes enable external data to be ingested by the pipeline.
     * 
     */
    @Import(name="sources", required=true)
      private final Output<List<Either<RtspSourceArgs,VideoSourceArgs>>> sources;

    public Output<List<Either<RtspSourceArgs,VideoSourceArgs>>> getSources() {
        return this.sources;
    }

    public PipelineTopologyArgs(
        Output<String> accountName,
        @Nullable Output<String> description,
        Output<Either<String,Kind>> kind,
        @Nullable Output<List<ParameterDeclarationArgs>> parameters,
        @Nullable Output<String> pipelineTopologyName,
        @Nullable Output<List<EncoderProcessorArgs>> processors,
        Output<String> resourceGroupName,
        Output<List<VideoSinkArgs>> sinks,
        Output<SkuArgs> sku,
        Output<List<Either<RtspSourceArgs,VideoSourceArgs>>> sources) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.description = description;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.parameters = parameters;
        this.pipelineTopologyName = pipelineTopologyName;
        this.processors = processors;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sinks = Objects.requireNonNull(sinks, "expected parameter 'sinks' to be non-null");
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
        this.sources = Objects.requireNonNull(sources, "expected parameter 'sources' to be non-null");
    }

    private PipelineTopologyArgs() {
        this.accountName = Output.empty();
        this.description = Output.empty();
        this.kind = Output.empty();
        this.parameters = Output.empty();
        this.pipelineTopologyName = Output.empty();
        this.processors = Output.empty();
        this.resourceGroupName = Output.empty();
        this.sinks = Output.empty();
        this.sku = Output.empty();
        this.sources = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineTopologyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private @Nullable Output<String> description;
        private Output<Either<String,Kind>> kind;
        private @Nullable Output<List<ParameterDeclarationArgs>> parameters;
        private @Nullable Output<String> pipelineTopologyName;
        private @Nullable Output<List<EncoderProcessorArgs>> processors;
        private Output<String> resourceGroupName;
        private Output<List<VideoSinkArgs>> sinks;
        private Output<SkuArgs> sku;
        private Output<List<Either<RtspSourceArgs,VideoSourceArgs>>> sources;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineTopologyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.description = defaults.description;
    	      this.kind = defaults.kind;
    	      this.parameters = defaults.parameters;
    	      this.pipelineTopologyName = defaults.pipelineTopologyName;
    	      this.processors = defaults.processors;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sinks = defaults.sinks;
    	      this.sku = defaults.sku;
    	      this.sources = defaults.sources;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder kind(Output<Either<String,Kind>> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder kind(Either<String,Kind> kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder parameters(@Nullable Output<List<ParameterDeclarationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder parameters(@Nullable List<ParameterDeclarationArgs> parameters) {
            this.parameters = Output.ofNullable(parameters);
            return this;
        }

        public Builder pipelineTopologyName(@Nullable Output<String> pipelineTopologyName) {
            this.pipelineTopologyName = pipelineTopologyName;
            return this;
        }

        public Builder pipelineTopologyName(@Nullable String pipelineTopologyName) {
            this.pipelineTopologyName = Output.ofNullable(pipelineTopologyName);
            return this;
        }

        public Builder processors(@Nullable Output<List<EncoderProcessorArgs>> processors) {
            this.processors = processors;
            return this;
        }

        public Builder processors(@Nullable List<EncoderProcessorArgs> processors) {
            this.processors = Output.ofNullable(processors);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder sinks(Output<List<VideoSinkArgs>> sinks) {
            this.sinks = Objects.requireNonNull(sinks);
            return this;
        }

        public Builder sinks(List<VideoSinkArgs> sinks) {
            this.sinks = Output.of(Objects.requireNonNull(sinks));
            return this;
        }

        public Builder sku(Output<SkuArgs> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder sku(SkuArgs sku) {
            this.sku = Output.of(Objects.requireNonNull(sku));
            return this;
        }

        public Builder sources(Output<List<Either<RtspSourceArgs,VideoSourceArgs>>> sources) {
            this.sources = Objects.requireNonNull(sources);
            return this;
        }

        public Builder sources(List<Either<RtspSourceArgs,VideoSourceArgs>> sources) {
            this.sources = Output.of(Objects.requireNonNull(sources));
            return this;
        }
        public PipelineTopologyArgs build() {
            return new PipelineTopologyArgs(accountName, description, kind, parameters, pipelineTopologyName, processors, resourceGroupName, sinks, sku, sources);
        }
    }
}
