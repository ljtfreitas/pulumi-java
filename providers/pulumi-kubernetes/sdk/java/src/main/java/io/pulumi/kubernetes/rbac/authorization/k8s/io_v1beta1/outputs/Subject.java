// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.rbac.authorization.k8s.io_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class Subject {
    /**
     * APIGroup holds the API group of the referenced subject. Defaults to "" for ServiceAccount subjects. Defaults to "rbac.authorization.k8s.io" for User and Group subjects.
     * 
     */
    private final @Nullable String apiGroup;
    /**
     * Kind of object being referenced. Values defined by this API group are "User", "Group", and "ServiceAccount". If the Authorizer does not recognized the kind value, the Authorizer should report an error.
     * 
     */
    private final String kind;
    /**
     * Name of the object being referenced.
     * 
     */
    private final String name;
    /**
     * Namespace of the referenced object.  If the object kind is non-namespace, such as "User" or "Group", and this value is not empty the Authorizer should report an error.
     * 
     */
    private final @Nullable String namespace;

    @CustomType.Constructor
    private Subject(
        @CustomType.Parameter("apiGroup") @Nullable String apiGroup,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("namespace") @Nullable String namespace) {
        this.apiGroup = apiGroup;
        this.kind = kind;
        this.name = name;
        this.namespace = namespace;
    }

    /**
     * APIGroup holds the API group of the referenced subject. Defaults to "" for ServiceAccount subjects. Defaults to "rbac.authorization.k8s.io" for User and Group subjects.
     * 
    */
    public Optional<String> getApiGroup() {
        return Optional.ofNullable(this.apiGroup);
    }
    /**
     * Kind of object being referenced. Values defined by this API group are "User", "Group", and "ServiceAccount". If the Authorizer does not recognized the kind value, the Authorizer should report an error.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Name of the object being referenced.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Namespace of the referenced object.  If the object kind is non-namespace, such as "User" or "Group", and this value is not empty the Authorizer should report an error.
     * 
    */
    public Optional<String> getNamespace() {
        return Optional.ofNullable(this.namespace);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Subject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiGroup;
        private String kind;
        private String name;
        private @Nullable String namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(Subject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiGroup = defaults.apiGroup;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
        }

        public Builder apiGroup(@Nullable String apiGroup) {
            this.apiGroup = apiGroup;
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }
        public Subject build() {
            return new Subject(apiGroup, kind, name, namespace);
        }
    }
}
