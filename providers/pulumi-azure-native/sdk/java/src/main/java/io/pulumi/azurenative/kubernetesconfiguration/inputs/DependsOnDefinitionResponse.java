// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specify which kustomizations must succeed reconciliation on the cluster prior to reconciling this kustomization
 * 
 */
public final class DependsOnDefinitionResponse extends io.pulumi.resources.InvokeArgs {

    public static final DependsOnDefinitionResponse Empty = new DependsOnDefinitionResponse();

    /**
     * Name of the kustomization to claim dependency on
     * 
     */
    @Import(name="kustomizationName")
      private final @Nullable String kustomizationName;

    public Optional<String> getKustomizationName() {
        return this.kustomizationName == null ? Optional.empty() : Optional.ofNullable(this.kustomizationName);
    }

    public DependsOnDefinitionResponse(@Nullable String kustomizationName) {
        this.kustomizationName = kustomizationName;
    }

    private DependsOnDefinitionResponse() {
        this.kustomizationName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DependsOnDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kustomizationName;

        public Builder() {
    	      // Empty
        }

        public Builder(DependsOnDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kustomizationName = defaults.kustomizationName;
        }

        public Builder kustomizationName(@Nullable String kustomizationName) {
            this.kustomizationName = kustomizationName;
            return this;
        }
        public DependsOnDefinitionResponse build() {
            return new DependsOnDefinitionResponse(kustomizationName);
        }
    }
}
