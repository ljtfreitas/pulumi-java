// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appstream;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.appstream.ApplicationEntitlementAssociationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::AppStream::ApplicationEntitlementAssociation
 * 
 */
@ResourceType(type="aws-native:appstream:ApplicationEntitlementAssociation")
public class ApplicationEntitlementAssociation extends io.pulumi.resources.CustomResource {
    @Export(name="applicationIdentifier", type=String.class, parameters={})
    private Output<String> applicationIdentifier;

    public Output<String> getApplicationIdentifier() {
        return this.applicationIdentifier;
    }
    @Export(name="entitlementName", type=String.class, parameters={})
    private Output<String> entitlementName;

    public Output<String> getEntitlementName() {
        return this.entitlementName;
    }
    @Export(name="stackName", type=String.class, parameters={})
    private Output<String> stackName;

    public Output<String> getStackName() {
        return this.stackName;
    }

    public interface BuilderApplicator {
        public void apply(ApplicationEntitlementAssociationArgs.Builder a);
    }
    private static io.pulumi.awsnative.appstream.ApplicationEntitlementAssociationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.appstream.ApplicationEntitlementAssociationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ApplicationEntitlementAssociation(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApplicationEntitlementAssociation(String name) {
        this(name, ApplicationEntitlementAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApplicationEntitlementAssociation(String name, ApplicationEntitlementAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApplicationEntitlementAssociation(String name, ApplicationEntitlementAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:appstream:ApplicationEntitlementAssociation", name, args == null ? ApplicationEntitlementAssociationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ApplicationEntitlementAssociation(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:appstream:ApplicationEntitlementAssociation", name, null, makeResourceOptions(options, id));
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
    public static ApplicationEntitlementAssociation get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ApplicationEntitlementAssociation(name, id, options);
    }
}
