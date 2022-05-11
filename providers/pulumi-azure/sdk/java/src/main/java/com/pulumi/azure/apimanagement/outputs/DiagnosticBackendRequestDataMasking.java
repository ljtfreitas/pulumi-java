// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.outputs;

import com.pulumi.azure.apimanagement.outputs.DiagnosticBackendRequestDataMaskingHeader;
import com.pulumi.azure.apimanagement.outputs.DiagnosticBackendRequestDataMaskingQueryParam;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DiagnosticBackendRequestDataMasking {
    private final @Nullable List<DiagnosticBackendRequestDataMaskingHeader> headers;
    private final @Nullable List<DiagnosticBackendRequestDataMaskingQueryParam> queryParams;

    @CustomType.Constructor
    private DiagnosticBackendRequestDataMasking(
        @CustomType.Parameter("headers") @Nullable List<DiagnosticBackendRequestDataMaskingHeader> headers,
        @CustomType.Parameter("queryParams") @Nullable List<DiagnosticBackendRequestDataMaskingQueryParam> queryParams) {
        this.headers = headers;
        this.queryParams = queryParams;
    }

    public List<DiagnosticBackendRequestDataMaskingHeader> headers() {
        return this.headers == null ? List.of() : this.headers;
    }
    public List<DiagnosticBackendRequestDataMaskingQueryParam> queryParams() {
        return this.queryParams == null ? List.of() : this.queryParams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiagnosticBackendRequestDataMasking defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DiagnosticBackendRequestDataMaskingHeader> headers;
        private @Nullable List<DiagnosticBackendRequestDataMaskingQueryParam> queryParams;

        public Builder() {
    	      // Empty
        }

        public Builder(DiagnosticBackendRequestDataMasking defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headers = defaults.headers;
    	      this.queryParams = defaults.queryParams;
        }

        public Builder headers(@Nullable List<DiagnosticBackendRequestDataMaskingHeader> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(DiagnosticBackendRequestDataMaskingHeader... headers) {
            return headers(List.of(headers));
        }
        public Builder queryParams(@Nullable List<DiagnosticBackendRequestDataMaskingQueryParam> queryParams) {
            this.queryParams = queryParams;
            return this;
        }
        public Builder queryParams(DiagnosticBackendRequestDataMaskingQueryParam... queryParams) {
            return queryParams(List.of(queryParams));
        }        public DiagnosticBackendRequestDataMasking build() {
            return new DiagnosticBackendRequestDataMasking(headers, queryParams);
        }
    }
}
