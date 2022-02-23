// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.k8s.io_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1.outputs.CustomResourceConversion;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1.outputs.CustomResourceDefinitionNames;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1.outputs.CustomResourceDefinitionVersion;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CustomResourceDefinitionSpec {
    /**
     * conversion defines conversion settings for the CRD.
     * 
     */
    private final @Nullable CustomResourceConversion conversion;
    /**
     * group is the API group of the defined custom resource. The custom resources are served under `/apis/<group>/...`. Must match the name of the CustomResourceDefinition (in the form `<names.plural>.<group>`).
     * 
     */
    private final String group;
    /**
     * names specify the resource and kind names for the custom resource.
     * 
     */
    private final CustomResourceDefinitionNames names;
    /**
     * preserveUnknownFields indicates that object fields which are not specified in the OpenAPI schema should be preserved when persisting to storage. apiVersion, kind, metadata and known fields inside metadata are always preserved. This field is deprecated in favor of setting `x-preserve-unknown-fields` to true in `spec.versions[*].schema.openAPIV3Schema`. See https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions/#pruning-versus-preserving-unknown-fields for details.
     * 
     */
    private final @Nullable Boolean preserveUnknownFields;
    /**
     * scope indicates whether the defined custom resource is cluster- or namespace-scoped. Allowed values are `Cluster` and `Namespaced`.
     * 
     */
    private final String scope;
    /**
     * versions is the list of all API versions of the defined custom resource. Version names are used to compute the order in which served versions are listed in API discovery. If the version string is "kube-like", it will sort above non "kube-like" version strings, which are ordered lexicographically. "Kube-like" versions start with a "v", then are followed by a number (the major version), then optionally the string "alpha" or "beta" and another number (the minor version). These are sorted first by GA > beta > alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
     * 
     */
    private final List<CustomResourceDefinitionVersion> versions;

    @OutputCustomType.Constructor({"conversion","group","names","preserveUnknownFields","scope","versions"})
    private CustomResourceDefinitionSpec(
        @Nullable CustomResourceConversion conversion,
        String group,
        CustomResourceDefinitionNames names,
        @Nullable Boolean preserveUnknownFields,
        String scope,
        List<CustomResourceDefinitionVersion> versions) {
        this.conversion = conversion;
        this.group = Objects.requireNonNull(group);
        this.names = Objects.requireNonNull(names);
        this.preserveUnknownFields = preserveUnknownFields;
        this.scope = Objects.requireNonNull(scope);
        this.versions = Objects.requireNonNull(versions);
    }

    /**
     * conversion defines conversion settings for the CRD.
     * 
     */
    public Optional<CustomResourceConversion> getConversion() {
        return Optional.ofNullable(this.conversion);
    }
    /**
     * group is the API group of the defined custom resource. The custom resources are served under `/apis/<group>/...`. Must match the name of the CustomResourceDefinition (in the form `<names.plural>.<group>`).
     * 
     */
    public String getGroup() {
        return this.group;
    }
    /**
     * names specify the resource and kind names for the custom resource.
     * 
     */
    public CustomResourceDefinitionNames getNames() {
        return this.names;
    }
    /**
     * preserveUnknownFields indicates that object fields which are not specified in the OpenAPI schema should be preserved when persisting to storage. apiVersion, kind, metadata and known fields inside metadata are always preserved. This field is deprecated in favor of setting `x-preserve-unknown-fields` to true in `spec.versions[*].schema.openAPIV3Schema`. See https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions/#pruning-versus-preserving-unknown-fields for details.
     * 
     */
    public Optional<Boolean> getPreserveUnknownFields() {
        return Optional.ofNullable(this.preserveUnknownFields);
    }
    /**
     * scope indicates whether the defined custom resource is cluster- or namespace-scoped. Allowed values are `Cluster` and `Namespaced`.
     * 
     */
    public String getScope() {
        return this.scope;
    }
    /**
     * versions is the list of all API versions of the defined custom resource. Version names are used to compute the order in which served versions are listed in API discovery. If the version string is "kube-like", it will sort above non "kube-like" version strings, which are ordered lexicographically. "Kube-like" versions start with a "v", then are followed by a number (the major version), then optionally the string "alpha" or "beta" and another number (the minor version). These are sorted first by GA > beta > alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
     * 
     */
    public List<CustomResourceDefinitionVersion> getVersions() {
        return this.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceDefinitionSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CustomResourceConversion conversion;
        private String group;
        private CustomResourceDefinitionNames names;
        private @Nullable Boolean preserveUnknownFields;
        private String scope;
        private List<CustomResourceDefinitionVersion> versions;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomResourceDefinitionSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conversion = defaults.conversion;
    	      this.group = defaults.group;
    	      this.names = defaults.names;
    	      this.preserveUnknownFields = defaults.preserveUnknownFields;
    	      this.scope = defaults.scope;
    	      this.versions = defaults.versions;
        }

        public Builder setConversion(@Nullable CustomResourceConversion conversion) {
            this.conversion = conversion;
            return this;
        }

        public Builder setGroup(String group) {
            this.group = Objects.requireNonNull(group);
            return this;
        }

        public Builder setNames(CustomResourceDefinitionNames names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }

        public Builder setPreserveUnknownFields(@Nullable Boolean preserveUnknownFields) {
            this.preserveUnknownFields = preserveUnknownFields;
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setVersions(List<CustomResourceDefinitionVersion> versions) {
            this.versions = Objects.requireNonNull(versions);
            return this;
        }
        public CustomResourceDefinitionSpec build() {
            return new CustomResourceDefinitionSpec(conversion, group, names, preserveUnknownFields, scope, versions);
        }
    }
}
