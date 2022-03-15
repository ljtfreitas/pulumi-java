// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.core_v1.inputs.ConfigMapKeySelectorArgs;
import io.pulumi.kubernetes.core_v1.inputs.ObjectFieldSelectorArgs;
import io.pulumi.kubernetes.core_v1.inputs.ResourceFieldSelectorArgs;
import io.pulumi.kubernetes.core_v1.inputs.SecretKeySelectorArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * EnvVarSource represents a source for the value of an EnvVar.
 * 
 */
public final class EnvVarSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvVarSourceArgs Empty = new EnvVarSourceArgs();

    /**
     * Selects a key of a ConfigMap.
     * 
     */
    @Import(name="configMapKeyRef")
      private final @Nullable Output<ConfigMapKeySelectorArgs> configMapKeyRef;

    public Output<ConfigMapKeySelectorArgs> getConfigMapKeyRef() {
        return this.configMapKeyRef == null ? Output.empty() : this.configMapKeyRef;
    }

    /**
     * Selects a field of the pod: supports metadata.name, metadata.namespace, `metadata.labels['<KEY>']`, `metadata.annotations['<KEY>']`, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.
     * 
     */
    @Import(name="fieldRef")
      private final @Nullable Output<ObjectFieldSelectorArgs> fieldRef;

    public Output<ObjectFieldSelectorArgs> getFieldRef() {
        return this.fieldRef == null ? Output.empty() : this.fieldRef;
    }

    /**
     * Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
     * 
     */
    @Import(name="resourceFieldRef")
      private final @Nullable Output<ResourceFieldSelectorArgs> resourceFieldRef;

    public Output<ResourceFieldSelectorArgs> getResourceFieldRef() {
        return this.resourceFieldRef == null ? Output.empty() : this.resourceFieldRef;
    }

    /**
     * Selects a key of a secret in the pod's namespace
     * 
     */
    @Import(name="secretKeyRef")
      private final @Nullable Output<SecretKeySelectorArgs> secretKeyRef;

    public Output<SecretKeySelectorArgs> getSecretKeyRef() {
        return this.secretKeyRef == null ? Output.empty() : this.secretKeyRef;
    }

    public EnvVarSourceArgs(
        @Nullable Output<ConfigMapKeySelectorArgs> configMapKeyRef,
        @Nullable Output<ObjectFieldSelectorArgs> fieldRef,
        @Nullable Output<ResourceFieldSelectorArgs> resourceFieldRef,
        @Nullable Output<SecretKeySelectorArgs> secretKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
        this.fieldRef = fieldRef;
        this.resourceFieldRef = resourceFieldRef;
        this.secretKeyRef = secretKeyRef;
    }

    private EnvVarSourceArgs() {
        this.configMapKeyRef = Output.empty();
        this.fieldRef = Output.empty();
        this.resourceFieldRef = Output.empty();
        this.secretKeyRef = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvVarSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ConfigMapKeySelectorArgs> configMapKeyRef;
        private @Nullable Output<ObjectFieldSelectorArgs> fieldRef;
        private @Nullable Output<ResourceFieldSelectorArgs> resourceFieldRef;
        private @Nullable Output<SecretKeySelectorArgs> secretKeyRef;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvVarSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMapKeyRef = defaults.configMapKeyRef;
    	      this.fieldRef = defaults.fieldRef;
    	      this.resourceFieldRef = defaults.resourceFieldRef;
    	      this.secretKeyRef = defaults.secretKeyRef;
        }

        public Builder configMapKeyRef(@Nullable Output<ConfigMapKeySelectorArgs> configMapKeyRef) {
            this.configMapKeyRef = configMapKeyRef;
            return this;
        }

        public Builder configMapKeyRef(@Nullable ConfigMapKeySelectorArgs configMapKeyRef) {
            this.configMapKeyRef = Output.ofNullable(configMapKeyRef);
            return this;
        }

        public Builder fieldRef(@Nullable Output<ObjectFieldSelectorArgs> fieldRef) {
            this.fieldRef = fieldRef;
            return this;
        }

        public Builder fieldRef(@Nullable ObjectFieldSelectorArgs fieldRef) {
            this.fieldRef = Output.ofNullable(fieldRef);
            return this;
        }

        public Builder resourceFieldRef(@Nullable Output<ResourceFieldSelectorArgs> resourceFieldRef) {
            this.resourceFieldRef = resourceFieldRef;
            return this;
        }

        public Builder resourceFieldRef(@Nullable ResourceFieldSelectorArgs resourceFieldRef) {
            this.resourceFieldRef = Output.ofNullable(resourceFieldRef);
            return this;
        }

        public Builder secretKeyRef(@Nullable Output<SecretKeySelectorArgs> secretKeyRef) {
            this.secretKeyRef = secretKeyRef;
            return this;
        }

        public Builder secretKeyRef(@Nullable SecretKeySelectorArgs secretKeyRef) {
            this.secretKeyRef = Output.ofNullable(secretKeyRef);
            return this;
        }
        public EnvVarSourceArgs build() {
            return new EnvVarSourceArgs(configMapKeyRef, fieldRef, resourceFieldRef, secretKeyRef);
        }
    }
}
