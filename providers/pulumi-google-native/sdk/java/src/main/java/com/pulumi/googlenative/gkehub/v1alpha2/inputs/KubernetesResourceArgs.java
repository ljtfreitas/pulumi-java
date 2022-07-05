// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub.v1alpha2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.gkehub.v1alpha2.inputs.ResourceOptionsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * KubernetesResource contains the YAML manifests and configuration for Membership Kubernetes resources in the cluster. After CreateMembership or UpdateMembership, these resources should be re-applied in the cluster.
 * 
 */
public final class KubernetesResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesResourceArgs Empty = new KubernetesResourceArgs();

    /**
     * Input only. The YAML representation of the Membership CR. This field is ignored for GKE clusters where Hub can read the CR directly. Callers should provide the CR that is currently present in the cluster during Create or Update, or leave this field empty if none exists. The CR manifest is used to validate the cluster has not been registered with another Membership.
     * 
     */
    @Import(name="membershipCrManifest")
    private @Nullable Output<String> membershipCrManifest;

    /**
     * @return Input only. The YAML representation of the Membership CR. This field is ignored for GKE clusters where Hub can read the CR directly. Callers should provide the CR that is currently present in the cluster during Create or Update, or leave this field empty if none exists. The CR manifest is used to validate the cluster has not been registered with another Membership.
     * 
     */
    public Optional<Output<String>> membershipCrManifest() {
        return Optional.ofNullable(this.membershipCrManifest);
    }

    /**
     * Optional. Options for Kubernetes resource generation.
     * 
     */
    @Import(name="resourceOptions")
    private @Nullable Output<ResourceOptionsArgs> resourceOptions;

    /**
     * @return Optional. Options for Kubernetes resource generation.
     * 
     */
    public Optional<Output<ResourceOptionsArgs>> resourceOptions() {
        return Optional.ofNullable(this.resourceOptions);
    }

    private KubernetesResourceArgs() {}

    private KubernetesResourceArgs(KubernetesResourceArgs $) {
        this.membershipCrManifest = $.membershipCrManifest;
        this.resourceOptions = $.resourceOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesResourceArgs $;

        public Builder() {
            $ = new KubernetesResourceArgs();
        }

        public Builder(KubernetesResourceArgs defaults) {
            $ = new KubernetesResourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param membershipCrManifest Input only. The YAML representation of the Membership CR. This field is ignored for GKE clusters where Hub can read the CR directly. Callers should provide the CR that is currently present in the cluster during Create or Update, or leave this field empty if none exists. The CR manifest is used to validate the cluster has not been registered with another Membership.
         * 
         * @return builder
         * 
         */
        public Builder membershipCrManifest(@Nullable Output<String> membershipCrManifest) {
            $.membershipCrManifest = membershipCrManifest;
            return this;
        }

        /**
         * @param membershipCrManifest Input only. The YAML representation of the Membership CR. This field is ignored for GKE clusters where Hub can read the CR directly. Callers should provide the CR that is currently present in the cluster during Create or Update, or leave this field empty if none exists. The CR manifest is used to validate the cluster has not been registered with another Membership.
         * 
         * @return builder
         * 
         */
        public Builder membershipCrManifest(String membershipCrManifest) {
            return membershipCrManifest(Output.of(membershipCrManifest));
        }

        /**
         * @param resourceOptions Optional. Options for Kubernetes resource generation.
         * 
         * @return builder
         * 
         */
        public Builder resourceOptions(@Nullable Output<ResourceOptionsArgs> resourceOptions) {
            $.resourceOptions = resourceOptions;
            return this;
        }

        /**
         * @param resourceOptions Optional. Options for Kubernetes resource generation.
         * 
         * @return builder
         * 
         */
        public Builder resourceOptions(ResourceOptionsArgs resourceOptions) {
            return resourceOptions(Output.of(resourceOptions));
        }

        public KubernetesResourceArgs build() {
            return $;
        }
    }

}
