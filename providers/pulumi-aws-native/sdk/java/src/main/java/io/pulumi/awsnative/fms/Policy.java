// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.fms;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.fms.PolicyArgs;
import io.pulumi.awsnative.fms.outputs.PolicyIEMap;
import io.pulumi.awsnative.fms.outputs.PolicyResourceTag;
import io.pulumi.awsnative.fms.outputs.PolicyTag;
import io.pulumi.awsnative.fms.outputs.SecurityServicePolicyDataProperties;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates an AWS Firewall Manager policy.
 * 
 */
@ResourceType(type="aws-native:fms:Policy")
public class Policy extends io.pulumi.resources.CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @Export(name="deleteAllPolicyResources", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deleteAllPolicyResources;

    public Output</* @Nullable */ Boolean> getDeleteAllPolicyResources() {
        return this.deleteAllPolicyResources;
    }
    @Export(name="excludeMap", type=PolicyIEMap.class, parameters={})
    private Output</* @Nullable */ PolicyIEMap> excludeMap;

    public Output</* @Nullable */ PolicyIEMap> getExcludeMap() {
        return this.excludeMap;
    }
    @Export(name="excludeResourceTags", type=Boolean.class, parameters={})
    private Output<Boolean> excludeResourceTags;

    public Output<Boolean> getExcludeResourceTags() {
        return this.excludeResourceTags;
    }
    @Export(name="includeMap", type=PolicyIEMap.class, parameters={})
    private Output</* @Nullable */ PolicyIEMap> includeMap;

    public Output</* @Nullable */ PolicyIEMap> getIncludeMap() {
        return this.includeMap;
    }
    @Export(name="policyName", type=String.class, parameters={})
    private Output<String> policyName;

    public Output<String> getPolicyName() {
        return this.policyName;
    }
    @Export(name="remediationEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> remediationEnabled;

    public Output<Boolean> getRemediationEnabled() {
        return this.remediationEnabled;
    }
    @Export(name="resourceTags", type=List.class, parameters={PolicyResourceTag.class})
    private Output</* @Nullable */ List<PolicyResourceTag>> resourceTags;

    public Output</* @Nullable */ List<PolicyResourceTag>> getResourceTags() {
        return this.resourceTags;
    }
    @Export(name="resourceType", type=String.class, parameters={})
    private Output<String> resourceType;

    public Output<String> getPropResourceType() {
        return this.resourceType;
    }
    @Export(name="resourceTypeList", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> resourceTypeList;

    public Output</* @Nullable */ List<String>> getResourceTypeList() {
        return this.resourceTypeList;
    }
    @Export(name="resourcesCleanUp", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> resourcesCleanUp;

    public Output</* @Nullable */ Boolean> getResourcesCleanUp() {
        return this.resourcesCleanUp;
    }
    @Export(name="securityServicePolicyData", type=SecurityServicePolicyDataProperties.class, parameters={})
    private Output<SecurityServicePolicyDataProperties> securityServicePolicyData;

    public Output<SecurityServicePolicyDataProperties> getSecurityServicePolicyData() {
        return this.securityServicePolicyData;
    }
    @Export(name="tags", type=List.class, parameters={PolicyTag.class})
    private Output</* @Nullable */ List<PolicyTag>> tags;

    public Output</* @Nullable */ List<PolicyTag>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(PolicyArgs.Builder a);
    }
    private static io.pulumi.awsnative.fms.PolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.fms.PolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Policy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Policy(String name) {
        this(name, PolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Policy(String name, PolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Policy(String name, PolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:fms:Policy", name, args == null ? PolicyArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Policy(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:fms:Policy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Policy get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Policy(name, id, options);
    }
}
