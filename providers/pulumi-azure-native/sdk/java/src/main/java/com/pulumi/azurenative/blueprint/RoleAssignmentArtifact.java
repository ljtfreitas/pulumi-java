// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.blueprint;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.blueprint.RoleAssignmentArtifactArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Blueprint artifact that applies a Role assignment.
 * API Version: 2018-11-01-preview.
 * 
 * ## Example Usage
 * ### MG-ARMTemplateArtifact
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var roleAssignmentArtifact = new RoleAssignmentArtifact(&#34;roleAssignmentArtifact&#34;, RoleAssignmentArtifactArgs.builder()        
 *             .artifactName(&#34;storageTemplate&#34;)
 *             .blueprintName(&#34;simpleBlueprint&#34;)
 *             .resourceScope(&#34;providers/Microsoft.Management/managementGroups/ContosoOnlineGroup&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### MG-PolicyAssignmentArtifact
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var roleAssignmentArtifact = new RoleAssignmentArtifact(&#34;roleAssignmentArtifact&#34;, RoleAssignmentArtifactArgs.builder()        
 *             .artifactName(&#34;costCenterPolicy&#34;)
 *             .blueprintName(&#34;simpleBlueprint&#34;)
 *             .resourceScope(&#34;providers/Microsoft.Management/managementGroups/ContosoOnlineGroup&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### MG-RoleAssignmentArtifact
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var roleAssignmentArtifact = new RoleAssignmentArtifact(&#34;roleAssignmentArtifact&#34;, RoleAssignmentArtifactArgs.builder()        
 *             .artifactName(&#34;ownerAssignment&#34;)
 *             .blueprintName(&#34;simpleBlueprint&#34;)
 *             .displayName(&#34;enforce owners of given subscription&#34;)
 *             .kind(&#34;roleAssignment&#34;)
 *             .principalIds(&#34;[parameters(&#39;owners&#39;)]&#34;)
 *             .resourceScope(&#34;providers/Microsoft.Management/managementGroups/ContosoOnlineGroup&#34;)
 *             .roleDefinitionId(&#34;/providers/Microsoft.Authorization/roleDefinitions/acdd72a7-3385-48ef-bd42-f606fba81ae7&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Sub-ARMTemplateArtifact
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var roleAssignmentArtifact = new RoleAssignmentArtifact(&#34;roleAssignmentArtifact&#34;, RoleAssignmentArtifactArgs.builder()        
 *             .artifactName(&#34;storageTemplate&#34;)
 *             .blueprintName(&#34;simpleBlueprint&#34;)
 *             .resourceScope(&#34;subscriptions/00000000-0000-0000-0000-000000000000&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Sub-PolicyAssignmentArtifact
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var roleAssignmentArtifact = new RoleAssignmentArtifact(&#34;roleAssignmentArtifact&#34;, RoleAssignmentArtifactArgs.builder()        
 *             .artifactName(&#34;costCenterPolicy&#34;)
 *             .blueprintName(&#34;simpleBlueprint&#34;)
 *             .resourceScope(&#34;subscriptions/00000000-0000-0000-0000-000000000000&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Sub-RoleAssignmentArtifact
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var roleAssignmentArtifact = new RoleAssignmentArtifact(&#34;roleAssignmentArtifact&#34;, RoleAssignmentArtifactArgs.builder()        
 *             .artifactName(&#34;ownerAssignment&#34;)
 *             .blueprintName(&#34;simpleBlueprint&#34;)
 *             .displayName(&#34;enforce owners of given subscription&#34;)
 *             .kind(&#34;roleAssignment&#34;)
 *             .principalIds(&#34;[parameters(&#39;owners&#39;)]&#34;)
 *             .resourceScope(&#34;subscriptions/00000000-0000-0000-0000-000000000000&#34;)
 *             .roleDefinitionId(&#34;/providers/Microsoft.Authorization/roleDefinitions/acdd72a7-3385-48ef-bd42-f606fba81ae7&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:blueprint:RoleAssignmentArtifact ownerAssignment /subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.Blueprint/blueprints/simpleBlueprint/artifacts/ownerAssignment 
 * ```
 * 
 */
@ResourceType(type="azure-native:blueprint:RoleAssignmentArtifact")
public class RoleAssignmentArtifact extends com.pulumi.resources.CustomResource {
    /**
     * Artifacts which need to be deployed before the specified artifact.
     * 
     */
    @Export(name="dependsOn", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> dependsOn;

    /**
     * @return Artifacts which need to be deployed before the specified artifact.
     * 
     */
    public Output<Optional<List<String>>> dependsOn() {
        return Codegen.optional(this.dependsOn);
    }
    /**
     * Multi-line explain this resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Multi-line explain this resource.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * One-liner string explain this resource.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return One-liner string explain this resource.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * Specifies the kind of blueprint artifact.
     * Expected value is &#39;roleAssignment&#39;.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Specifies the kind of blueprint artifact.
     * Expected value is &#39;roleAssignment&#39;.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Name of this resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of this resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Array of user or group identities in Azure Active Directory. The roleDefinition will apply to each identity.
     * 
     */
    @Export(name="principalIds", type=Object.class, parameters={})
    private Output<Object> principalIds;

    /**
     * @return Array of user or group identities in Azure Active Directory. The roleDefinition will apply to each identity.
     * 
     */
    public Output<Object> principalIds() {
        return this.principalIds;
    }
    /**
     * RoleAssignment will be scope to this resourceGroup. If empty, it scopes to the subscription.
     * 
     */
    @Export(name="resourceGroup", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceGroup;

    /**
     * @return RoleAssignment will be scope to this resourceGroup. If empty, it scopes to the subscription.
     * 
     */
    public Output<Optional<String>> resourceGroup() {
        return Codegen.optional(this.resourceGroup);
    }
    /**
     * Azure resource ID of the RoleDefinition.
     * 
     */
    @Export(name="roleDefinitionId", type=String.class, parameters={})
    private Output<String> roleDefinitionId;

    /**
     * @return Azure resource ID of the RoleDefinition.
     * 
     */
    public Output<String> roleDefinitionId() {
        return this.roleDefinitionId;
    }
    /**
     * Type of this resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of this resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RoleAssignmentArtifact(String name) {
        this(name, RoleAssignmentArtifactArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RoleAssignmentArtifact(String name, RoleAssignmentArtifactArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RoleAssignmentArtifact(String name, RoleAssignmentArtifactArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:blueprint:RoleAssignmentArtifact", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private RoleAssignmentArtifact(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:blueprint:RoleAssignmentArtifact", name, null, makeResourceOptions(options, id));
    }

    private static RoleAssignmentArtifactArgs makeArgs(RoleAssignmentArtifactArgs args) {
        var builder = args == null ? RoleAssignmentArtifactArgs.builder() : RoleAssignmentArtifactArgs.builder(args);
        return builder
            .kind("roleAssignment")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:blueprint/v20181101preview:RoleAssignmentArtifact").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RoleAssignmentArtifact get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RoleAssignmentArtifact(name, id, options);
    }
}
