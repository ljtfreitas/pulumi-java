// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specify which kustomizations must succeed reconciliation on the cluster prior to reconciling this kustomization
 * 
 */
public final class DependsOnDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DependsOnDefinitionArgs Empty = new DependsOnDefinitionArgs();

    /**
     * Name of the kustomization to claim dependency on
     * 
     */
    @InputImport(name="kustomizationName")
        private final @Nullable Input<String> kustomizationName;

    public Input<String> getKustomizationName() {
        return this.kustomizationName == null ? Input.empty() : this.kustomizationName;
    }

    public DependsOnDefinitionArgs(@Nullable Input<String> kustomizationName) {
        this.kustomizationName = kustomizationName;
    }

    private DependsOnDefinitionArgs() {
        this.kustomizationName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DependsOnDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kustomizationName;

        public Builder() {
    	      // Empty
        }

        public Builder(DependsOnDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kustomizationName = defaults.kustomizationName;
        }

        public Builder setKustomizationName(@Nullable Input<String> kustomizationName) {
            this.kustomizationName = kustomizationName;
            return this;
        }

        public Builder setKustomizationName(@Nullable String kustomizationName) {
            this.kustomizationName = Input.ofNullable(kustomizationName);
            return this;
        }
        public DependsOnDefinitionArgs build() {
            return new DependsOnDefinitionArgs(kustomizationName);
        }
    }
}
