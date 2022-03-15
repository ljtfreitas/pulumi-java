// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies that the scope of the extensionInstance is Namespace
 * 
 */
public final class ScopeNamespaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScopeNamespaceArgs Empty = new ScopeNamespaceArgs();

    /**
     * Namespace where the extensionInstance will be created for an Namespace scoped extensionInstance.  If this namespace does not exist, it will be created
     * 
     */
    @Import(name="targetNamespace")
      private final @Nullable Output<String> targetNamespace;

    public Output<String> getTargetNamespace() {
        return this.targetNamespace == null ? Output.empty() : this.targetNamespace;
    }

    public ScopeNamespaceArgs(@Nullable Output<String> targetNamespace) {
        this.targetNamespace = targetNamespace;
    }

    private ScopeNamespaceArgs() {
        this.targetNamespace = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScopeNamespaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> targetNamespace;

        public Builder() {
    	      // Empty
        }

        public Builder(ScopeNamespaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetNamespace = defaults.targetNamespace;
        }

        public Builder targetNamespace(@Nullable Output<String> targetNamespace) {
            this.targetNamespace = targetNamespace;
            return this;
        }

        public Builder targetNamespace(@Nullable String targetNamespace) {
            this.targetNamespace = Output.ofNullable(targetNamespace);
            return this;
        }
        public ScopeNamespaceArgs build() {
            return new ScopeNamespaceArgs(targetNamespace);
        }
    }
}
