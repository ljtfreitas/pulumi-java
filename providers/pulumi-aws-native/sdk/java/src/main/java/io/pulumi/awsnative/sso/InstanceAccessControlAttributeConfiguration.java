// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sso;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.sso.InstanceAccessControlAttributeConfigurationArgs;
import io.pulumi.awsnative.sso.outputs.InstanceAccessControlAttributeConfigurationAccessControlAttribute;
import io.pulumi.awsnative.sso.outputs.InstanceAccessControlAttributeConfigurationProperties;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for SSO InstanceAccessControlAttributeConfiguration
 * 
 */
@ResourceType(type="aws-native:sso:InstanceAccessControlAttributeConfiguration")
public class InstanceAccessControlAttributeConfiguration extends io.pulumi.resources.CustomResource {
    @Export(name="accessControlAttributes", type=List.class, parameters={InstanceAccessControlAttributeConfigurationAccessControlAttribute.class})
    private Output</* @Nullable */ List<InstanceAccessControlAttributeConfigurationAccessControlAttribute>> accessControlAttributes;

    public Output</* @Nullable */ List<InstanceAccessControlAttributeConfigurationAccessControlAttribute>> getAccessControlAttributes() {
        return this.accessControlAttributes;
    }
    /**
     * The InstanceAccessControlAttributeConfiguration property has been deprecated but is still supported for backwards compatibility purposes. We recomend that you use  AccessControlAttributes property instead.
     * 
     */
    @Export(name="instanceAccessControlAttributeConfiguration", type=InstanceAccessControlAttributeConfigurationProperties.class, parameters={})
    private Output</* @Nullable */ InstanceAccessControlAttributeConfigurationProperties> instanceAccessControlAttributeConfiguration;

    /**
     * @return The InstanceAccessControlAttributeConfiguration property has been deprecated but is still supported for backwards compatibility purposes. We recomend that you use  AccessControlAttributes property instead.
     * 
     */
    public Output</* @Nullable */ InstanceAccessControlAttributeConfigurationProperties> getInstanceAccessControlAttributeConfiguration() {
        return this.instanceAccessControlAttributeConfiguration;
    }
    /**
     * The ARN of the AWS SSO instance under which the operation will be executed.
     * 
     */
    @Export(name="instanceArn", type=String.class, parameters={})
    private Output<String> instanceArn;

    /**
     * @return The ARN of the AWS SSO instance under which the operation will be executed.
     * 
     */
    public Output<String> getInstanceArn() {
        return this.instanceArn;
    }

    public interface BuilderApplicator {
        public void apply(InstanceAccessControlAttributeConfigurationArgs.Builder a);
    }
    private static io.pulumi.awsnative.sso.InstanceAccessControlAttributeConfigurationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.sso.InstanceAccessControlAttributeConfigurationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public InstanceAccessControlAttributeConfiguration(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InstanceAccessControlAttributeConfiguration(String name) {
        this(name, InstanceAccessControlAttributeConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstanceAccessControlAttributeConfiguration(String name, InstanceAccessControlAttributeConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceAccessControlAttributeConfiguration(String name, InstanceAccessControlAttributeConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sso:InstanceAccessControlAttributeConfiguration", name, args == null ? InstanceAccessControlAttributeConfigurationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private InstanceAccessControlAttributeConfiguration(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sso:InstanceAccessControlAttributeConfiguration", name, null, makeResourceOptions(options, id));
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
    public static InstanceAccessControlAttributeConfiguration get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new InstanceAccessControlAttributeConfiguration(name, id, options);
    }
}
