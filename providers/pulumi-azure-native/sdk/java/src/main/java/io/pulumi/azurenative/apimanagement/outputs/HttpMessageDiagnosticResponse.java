// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.azurenative.apimanagement.outputs.BodyDiagnosticSettingsResponse;
import io.pulumi.azurenative.apimanagement.outputs.DataMaskingResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HttpMessageDiagnosticResponse {
    /**
     * Body logging settings.
     * 
     */
    private final @Nullable BodyDiagnosticSettingsResponse body;
    /**
     * Data masking settings.
     * 
     */
    private final @Nullable DataMaskingResponse dataMasking;
    /**
     * Array of HTTP Headers to log.
     * 
     */
    private final @Nullable List<String> headers;

    @OutputCustomType.Constructor({"body","dataMasking","headers"})
    private HttpMessageDiagnosticResponse(
        @Nullable BodyDiagnosticSettingsResponse body,
        @Nullable DataMaskingResponse dataMasking,
        @Nullable List<String> headers) {
        this.body = body;
        this.dataMasking = dataMasking;
        this.headers = headers;
    }

    /**
     * Body logging settings.
     * 
     */
    public Optional<BodyDiagnosticSettingsResponse> getBody() {
        return Optional.ofNullable(this.body);
    }
    /**
     * Data masking settings.
     * 
     */
    public Optional<DataMaskingResponse> getDataMasking() {
        return Optional.ofNullable(this.dataMasking);
    }
    /**
     * Array of HTTP Headers to log.
     * 
     */
    public List<String> getHeaders() {
        return this.headers == null ? List.of() : this.headers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpMessageDiagnosticResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BodyDiagnosticSettingsResponse body;
        private @Nullable DataMaskingResponse dataMasking;
        private @Nullable List<String> headers;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpMessageDiagnosticResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.body = defaults.body;
    	      this.dataMasking = defaults.dataMasking;
    	      this.headers = defaults.headers;
        }

        public Builder setBody(@Nullable BodyDiagnosticSettingsResponse body) {
            this.body = body;
            return this;
        }

        public Builder setDataMasking(@Nullable DataMaskingResponse dataMasking) {
            this.dataMasking = dataMasking;
            return this;
        }

        public Builder setHeaders(@Nullable List<String> headers) {
            this.headers = headers;
            return this;
        }
        public HttpMessageDiagnosticResponse build() {
            return new HttpMessageDiagnosticResponse(body, dataMasking, headers);
        }
    }
}
