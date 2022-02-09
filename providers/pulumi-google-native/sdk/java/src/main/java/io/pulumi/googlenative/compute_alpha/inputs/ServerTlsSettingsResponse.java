// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.TlsContextResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ServerTlsSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServerTlsSettingsResponse Empty = new ServerTlsSettingsResponse();

    @InputImport(name="proxyTlsContext", required=true)
    private final TlsContextResponse proxyTlsContext;

    public TlsContextResponse getProxyTlsContext() {
        return this.proxyTlsContext;
    }

    @InputImport(name="subjectAltNames", required=true)
    private final List<String> subjectAltNames;

    public List<String> getSubjectAltNames() {
        return this.subjectAltNames;
    }

    @InputImport(name="tlsMode", required=true)
    private final String tlsMode;

    public String getTlsMode() {
        return this.tlsMode;
    }

    public ServerTlsSettingsResponse(
        TlsContextResponse proxyTlsContext,
        List<String> subjectAltNames,
        String tlsMode) {
        this.proxyTlsContext = Objects.requireNonNull(proxyTlsContext, "expected parameter 'proxyTlsContext' to be non-null");
        this.subjectAltNames = Objects.requireNonNull(subjectAltNames, "expected parameter 'subjectAltNames' to be non-null");
        this.tlsMode = Objects.requireNonNull(tlsMode, "expected parameter 'tlsMode' to be non-null");
    }

    private ServerTlsSettingsResponse() {
        this.proxyTlsContext = null;
        this.subjectAltNames = List.of();
        this.tlsMode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerTlsSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TlsContextResponse proxyTlsContext;
        private List<String> subjectAltNames;
        private String tlsMode;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerTlsSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.proxyTlsContext = defaults.proxyTlsContext;
    	      this.subjectAltNames = defaults.subjectAltNames;
    	      this.tlsMode = defaults.tlsMode;
        }

        public Builder setProxyTlsContext(TlsContextResponse proxyTlsContext) {
            this.proxyTlsContext = Objects.requireNonNull(proxyTlsContext);
            return this;
        }

        public Builder setSubjectAltNames(List<String> subjectAltNames) {
            this.subjectAltNames = Objects.requireNonNull(subjectAltNames);
            return this;
        }

        public Builder setTlsMode(String tlsMode) {
            this.tlsMode = Objects.requireNonNull(tlsMode);
            return this;
        }

        public ServerTlsSettingsResponse build() {
            return new ServerTlsSettingsResponse(proxyTlsContext, subjectAltNames, tlsMode);
        }
    }
}