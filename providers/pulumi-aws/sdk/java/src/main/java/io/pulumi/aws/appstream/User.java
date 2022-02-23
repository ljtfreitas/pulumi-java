// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.appstream.UserArgs;
import io.pulumi.aws.appstream.inputs.UserState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an AppStream user.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_appstream_user` can be imported using the `user_name` and `authentication_type` separated by a slash (`/`), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:appstream/user:User example UserName/AuthenticationType
 * ```
 * 
 */
@ResourceType(type="aws:appstream/user:User")
public class User extends io.pulumi.resources.CustomResource {
    /**
     * ARN of the appstream user.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the appstream user.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Authentication type for the user. You must specify USERPOOL. Valid values: `API`, `SAML`, `USERPOOL`
     * 
     */
    @OutputExport(name="authenticationType", type=String.class, parameters={})
    private Output<String> authenticationType;

    /**
     * @return Authentication type for the user. You must specify USERPOOL. Valid values: `API`, `SAML`, `USERPOOL`
     * 
     */
    public Output<String> getAuthenticationType() {
        return this.authenticationType;
    }
    /**
     * Date and time, in UTC and extended RFC 3339 format, when the user was created.
     * 
     */
    @OutputExport(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    /**
     * @return Date and time, in UTC and extended RFC 3339 format, when the user was created.
     * 
     */
    public Output<String> getCreatedTime() {
        return this.createdTime;
    }
    /**
     * Specifies whether the user in the user pool is enabled.
     * 
     */
    @OutputExport(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Specifies whether the user in the user pool is enabled.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnabled() {
        return this.enabled;
    }
    /**
     * First name, or given name, of the user.
     * 
     */
    @OutputExport(name="firstName", type=String.class, parameters={})
    private Output</* @Nullable */ String> firstName;

    /**
     * @return First name, or given name, of the user.
     * 
     */
    public Output</* @Nullable */ String> getFirstName() {
        return this.firstName;
    }
    /**
     * Last name, or surname, of the user.
     * 
     */
    @OutputExport(name="lastName", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastName;

    /**
     * @return Last name, or surname, of the user.
     * 
     */
    public Output</* @Nullable */ String> getLastName() {
        return this.lastName;
    }
    /**
     * Send an email notification.
     * 
     */
    @OutputExport(name="sendEmailNotification", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> sendEmailNotification;

    /**
     * @return Send an email notification.
     * 
     */
    public Output</* @Nullable */ Boolean> getSendEmailNotification() {
        return this.sendEmailNotification;
    }
    /**
     * Email address of the user.
     * 
     */
    @OutputExport(name="userName", type=String.class, parameters={})
    private Output<String> userName;

    /**
     * @return Email address of the user.
     * 
     */
    public Output<String> getUserName() {
        return this.userName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public User(String name, UserArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:appstream/user:User", name, args == null ? UserArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private User(String name, Input<String> id, @Nullable UserState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:appstream/user:User", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
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
    public static User get(String name, Input<String> id, @Nullable UserState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new User(name, id, state, options);
    }
}
