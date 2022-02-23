// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.azurenative.apimanagement.inputs.HttpMessageDiagnosticResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Diagnostic settings for incoming/outgoing HTTP messages to the Gateway.
 * 
 */
public final class PipelineDiagnosticSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final PipelineDiagnosticSettingsResponse Empty = new PipelineDiagnosticSettingsResponse();

    /**
     * Diagnostic settings for request.
     * 
     */
    @InputImport(name="request")
        private final @Nullable HttpMessageDiagnosticResponse request;

    public Optional<HttpMessageDiagnosticResponse> getRequest() {
        return this.request == null ? Optional.empty() : Optional.ofNullable(this.request);
    }

    /**
     * Diagnostic settings for response.
     * 
     */
    @InputImport(name="response")
        private final @Nullable HttpMessageDiagnosticResponse response;

    public Optional<HttpMessageDiagnosticResponse> getResponse() {
        return this.response == null ? Optional.empty() : Optional.ofNullable(this.response);
    }

    public PipelineDiagnosticSettingsResponse(
        @Nullable HttpMessageDiagnosticResponse request,
        @Nullable HttpMessageDiagnosticResponse response) {
        this.request = request;
        this.response = response;
    }

    private PipelineDiagnosticSettingsResponse() {
        this.request = null;
        this.response = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineDiagnosticSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable HttpMessageDiagnosticResponse request;
        private @Nullable HttpMessageDiagnosticResponse response;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineDiagnosticSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.request = defaults.request;
    	      this.response = defaults.response;
        }

        public Builder setRequest(@Nullable HttpMessageDiagnosticResponse request) {
            this.request = request;
            return this;
        }

        public Builder setResponse(@Nullable HttpMessageDiagnosticResponse response) {
            this.response = response;
            return this;
        }
        public PipelineDiagnosticSettingsResponse build() {
            return new PipelineDiagnosticSettingsResponse(request, response);
        }
    }
}
