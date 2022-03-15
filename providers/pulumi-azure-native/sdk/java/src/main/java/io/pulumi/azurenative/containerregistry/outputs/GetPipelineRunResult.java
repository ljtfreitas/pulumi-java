// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.PipelineRunRequestResponse;
import io.pulumi.azurenative.containerregistry.outputs.PipelineRunResponseResponse;
import io.pulumi.azurenative.containerregistry.outputs.SystemDataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPipelineRunResult {
    /**
     * How the pipeline run should be forced to recreate even if the pipeline run configuration has not changed.
     * 
     */
    private final @Nullable String forceUpdateTag;
    /**
     * The resource ID.
     * 
     */
    private final String id;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * The provisioning state of a pipeline run.
     * 
     */
    private final String provisioningState;
    /**
     * The request parameters for a pipeline run.
     * 
     */
    private final @Nullable PipelineRunRequestResponse request;
    /**
     * The response of a pipeline run.
     * 
     */
    private final PipelineRunResponseResponse response;
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The type of the resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetPipelineRunResult(
        @CustomType.Parameter("forceUpdateTag") @Nullable String forceUpdateTag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("request") @Nullable PipelineRunRequestResponse request,
        @CustomType.Parameter("response") PipelineRunResponseResponse response,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.forceUpdateTag = forceUpdateTag;
        this.id = id;
        this.name = name;
        this.provisioningState = provisioningState;
        this.request = request;
        this.response = response;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * How the pipeline run should be forced to recreate even if the pipeline run configuration has not changed.
     * 
    */
    public Optional<String> getForceUpdateTag() {
        return Optional.ofNullable(this.forceUpdateTag);
    }
    /**
     * The resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The provisioning state of a pipeline run.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The request parameters for a pipeline run.
     * 
    */
    public Optional<PipelineRunRequestResponse> getRequest() {
        return Optional.ofNullable(this.request);
    }
    /**
     * The response of a pipeline run.
     * 
    */
    public PipelineRunResponseResponse getResponse() {
        return this.response;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPipelineRunResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String forceUpdateTag;
        private String id;
        private String name;
        private String provisioningState;
        private @Nullable PipelineRunRequestResponse request;
        private PipelineRunResponseResponse response;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPipelineRunResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forceUpdateTag = defaults.forceUpdateTag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.request = defaults.request;
    	      this.response = defaults.response;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder forceUpdateTag(@Nullable String forceUpdateTag) {
            this.forceUpdateTag = forceUpdateTag;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder request(@Nullable PipelineRunRequestResponse request) {
            this.request = request;
            return this;
        }

        public Builder response(PipelineRunResponseResponse response) {
            this.response = Objects.requireNonNull(response);
            return this;
        }

        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetPipelineRunResult build() {
            return new GetPipelineRunResult(forceUpdateTag, id, name, provisioningState, request, response, systemData, type);
        }
    }
}
