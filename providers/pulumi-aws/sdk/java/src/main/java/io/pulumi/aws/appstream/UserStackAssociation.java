// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.appstream.UserStackAssociationArgs;
import io.pulumi.aws.appstream.inputs.UserStackAssociationState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages an AppStream User Stack association.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * AppStream User Stack Association can be imported by using the `user_name`, `authentication_type`, and `stack_name`, separated by a slash (`/`), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:appstream/userStackAssociation:UserStackAssociation example userName/auhtenticationType/stackName
 * ```
 * 
 */
@ResourceType(type="aws:appstream/userStackAssociation:UserStackAssociation")
public class UserStackAssociation extends io.pulumi.resources.CustomResource {
    /**
     * Authentication type for the user.
     * 
     */
    @Export(name="authenticationType", type=String.class, parameters={})
    private Output<String> authenticationType;

    /**
     * @return Authentication type for the user.
     * 
     */
    public Output<String> getAuthenticationType() {
        return this.authenticationType;
    }
    /**
     * Specifies whether a welcome email is sent to a user after the user is created in the user pool.
     * 
     */
    @Export(name="sendEmailNotification", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> sendEmailNotification;

    /**
     * @return Specifies whether a welcome email is sent to a user after the user is created in the user pool.
     * 
     */
    public Output</* @Nullable */ Boolean> getSendEmailNotification() {
        return this.sendEmailNotification;
    }
    /**
     * Name of the stack that is associated with the user.
     * 
     */
    @Export(name="stackName", type=String.class, parameters={})
    private Output<String> stackName;

    /**
     * @return Name of the stack that is associated with the user.
     * 
     */
    public Output<String> getStackName() {
        return this.stackName;
    }
    /**
     * Email address of the user who is associated with the stack.
     * 
     */
    @Export(name="userName", type=String.class, parameters={})
    private Output<String> userName;

    /**
     * @return Email address of the user who is associated with the stack.
     * 
     */
    public Output<String> getUserName() {
        return this.userName;
    }

    public interface BuilderApplicator {
        public void apply(UserStackAssociationArgs.Builder a);
    }
    private static io.pulumi.aws.appstream.UserStackAssociationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.appstream.UserStackAssociationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public UserStackAssociation(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UserStackAssociation(String name) {
        this(name, UserStackAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UserStackAssociation(String name, UserStackAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserStackAssociation(String name, UserStackAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:appstream/userStackAssociation:UserStackAssociation", name, args == null ? UserStackAssociationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private UserStackAssociation(String name, Output<String> id, @Nullable UserStackAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:appstream/userStackAssociation:UserStackAssociation", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static UserStackAssociation get(String name, Output<String> id, @Nullable UserStackAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new UserStackAssociation(name, id, state, options);
    }
}
