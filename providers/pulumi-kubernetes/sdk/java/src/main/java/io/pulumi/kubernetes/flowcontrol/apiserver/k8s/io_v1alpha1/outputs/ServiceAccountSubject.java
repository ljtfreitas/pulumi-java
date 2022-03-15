// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ServiceAccountSubject {
    /**
     * `name` is the name of matching ServiceAccount objects, or "*" to match regardless of name. Required.
     * 
     */
    private final String name;
    /**
     * `namespace` is the namespace of matching ServiceAccount objects. Required.
     * 
     */
    private final String namespace;

    @CustomType.Constructor
    private ServiceAccountSubject(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("namespace") String namespace) {
        this.name = name;
        this.namespace = namespace;
    }

    /**
     * `name` is the name of matching ServiceAccount objects, or "*" to match regardless of name. Required.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * `namespace` is the namespace of matching ServiceAccount objects. Required.
     * 
    */
    public String getNamespace() {
        return this.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAccountSubject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAccountSubject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        public ServiceAccountSubject build() {
            return new ServiceAccountSubject(name, namespace);
        }
    }
}
