// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.networking.k8s.io_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.networking.k8s.io_v1.outputs.IngressBackend;
import io.pulumi.kubernetes.networking.k8s.io_v1.outputs.IngressRule;
import io.pulumi.kubernetes.networking.k8s.io_v1.outputs.IngressTLS;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IngressSpec {
    /**
     * DefaultBackend is the backend that should handle requests that don't match any rule. If Rules are not specified, DefaultBackend must be specified. If DefaultBackend is not set, the handling of requests that do not match any of the rules will be up to the Ingress controller.
     * 
     */
    private final @Nullable IngressBackend defaultBackend;
    /**
     * IngressClassName is the name of the IngressClass cluster resource. The associated IngressClass defines which controller will implement the resource. This replaces the deprecated `kubernetes.io/ingress.class` annotation. For backwards compatibility, when that annotation is set, it must be given precedence over this field. The controller may emit a warning if the field and annotation have different values. Implementations of this API should ignore Ingresses without a class specified. An IngressClass resource may be marked as default, which can be used to set a default value for this field. For more information, refer to the IngressClass documentation.
     * 
     */
    private final @Nullable String ingressClassName;
    /**
     * A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all traffic is sent to the default backend.
     * 
     */
    private final @Nullable List<IngressRule> rules;
    /**
     * TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS extension, if the ingress controller fulfilling the ingress supports SNI.
     * 
     */
    private final @Nullable List<IngressTLS> tls;

    @CustomType.Constructor
    private IngressSpec(
        @CustomType.Parameter("defaultBackend") @Nullable IngressBackend defaultBackend,
        @CustomType.Parameter("ingressClassName") @Nullable String ingressClassName,
        @CustomType.Parameter("rules") @Nullable List<IngressRule> rules,
        @CustomType.Parameter("tls") @Nullable List<IngressTLS> tls) {
        this.defaultBackend = defaultBackend;
        this.ingressClassName = ingressClassName;
        this.rules = rules;
        this.tls = tls;
    }

    /**
     * DefaultBackend is the backend that should handle requests that don't match any rule. If Rules are not specified, DefaultBackend must be specified. If DefaultBackend is not set, the handling of requests that do not match any of the rules will be up to the Ingress controller.
     * 
    */
    public Optional<IngressBackend> getDefaultBackend() {
        return Optional.ofNullable(this.defaultBackend);
    }
    /**
     * IngressClassName is the name of the IngressClass cluster resource. The associated IngressClass defines which controller will implement the resource. This replaces the deprecated `kubernetes.io/ingress.class` annotation. For backwards compatibility, when that annotation is set, it must be given precedence over this field. The controller may emit a warning if the field and annotation have different values. Implementations of this API should ignore Ingresses without a class specified. An IngressClass resource may be marked as default, which can be used to set a default value for this field. For more information, refer to the IngressClass documentation.
     * 
    */
    public Optional<String> getIngressClassName() {
        return Optional.ofNullable(this.ingressClassName);
    }
    /**
     * A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all traffic is sent to the default backend.
     * 
    */
    public List<IngressRule> getRules() {
        return this.rules == null ? List.of() : this.rules;
    }
    /**
     * TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS extension, if the ingress controller fulfilling the ingress supports SNI.
     * 
    */
    public List<IngressTLS> getTls() {
        return this.tls == null ? List.of() : this.tls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable IngressBackend defaultBackend;
        private @Nullable String ingressClassName;
        private @Nullable List<IngressRule> rules;
        private @Nullable List<IngressTLS> tls;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultBackend = defaults.defaultBackend;
    	      this.ingressClassName = defaults.ingressClassName;
    	      this.rules = defaults.rules;
    	      this.tls = defaults.tls;
        }

        public Builder defaultBackend(@Nullable IngressBackend defaultBackend) {
            this.defaultBackend = defaultBackend;
            return this;
        }

        public Builder ingressClassName(@Nullable String ingressClassName) {
            this.ingressClassName = ingressClassName;
            return this;
        }

        public Builder rules(@Nullable List<IngressRule> rules) {
            this.rules = rules;
            return this;
        }

        public Builder tls(@Nullable List<IngressTLS> tls) {
            this.tls = tls;
            return this;
        }
        public IngressSpec build() {
            return new IngressSpec(defaultBackend, ingressClassName, rules, tls);
        }
    }
}
