// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.directoryservice;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.directoryservice.DirectoryArgs;
import com.pulumi.aws.directoryservice.inputs.DirectoryState;
import com.pulumi.aws.directoryservice.outputs.DirectoryConnectSettings;
import com.pulumi.aws.directoryservice.outputs.DirectoryVpcSettings;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Simple or Managed Microsoft directory in AWS Directory Service.
 * 
 * ## Example Usage
 * ### SimpleAD
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
 *         var main = new Vpc(&#34;main&#34;, VpcArgs.builder()        
 *             .cidrBlock(&#34;10.0.0.0/16&#34;)
 *             .build());
 * 
 *         var foo = new Subnet(&#34;foo&#34;, SubnetArgs.builder()        
 *             .vpcId(main.getId())
 *             .availabilityZone(&#34;us-west-2a&#34;)
 *             .cidrBlock(&#34;10.0.1.0/24&#34;)
 *             .build());
 * 
 *         var barSubnet = new Subnet(&#34;barSubnet&#34;, SubnetArgs.builder()        
 *             .vpcId(main.getId())
 *             .availabilityZone(&#34;us-west-2b&#34;)
 *             .cidrBlock(&#34;10.0.2.0/24&#34;)
 *             .build());
 * 
 *         var barDirectory = new Directory(&#34;barDirectory&#34;, DirectoryArgs.builder()        
 *             .name(&#34;corp.notexample.com&#34;)
 *             .password(&#34;SuperSecretPassw0rd&#34;)
 *             .size(&#34;Small&#34;)
 *             .vpcSettings(DirectoryVpcSettings.builder()
 *                 .vpcId(main.getId())
 *                 .subnetIds(                
 *                     foo.getId(),
 *                     barSubnet.getId())
 *                 .build())
 *             .tags(Map.of(&#34;Project&#34;, &#34;foo&#34;))
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Microsoft Active Directory (MicrosoftAD)
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
 *         var main = new Vpc(&#34;main&#34;, VpcArgs.builder()        
 *             .cidrBlock(&#34;10.0.0.0/16&#34;)
 *             .build());
 * 
 *         var foo = new Subnet(&#34;foo&#34;, SubnetArgs.builder()        
 *             .vpcId(main.getId())
 *             .availabilityZone(&#34;us-west-2a&#34;)
 *             .cidrBlock(&#34;10.0.1.0/24&#34;)
 *             .build());
 * 
 *         var barSubnet = new Subnet(&#34;barSubnet&#34;, SubnetArgs.builder()        
 *             .vpcId(main.getId())
 *             .availabilityZone(&#34;us-west-2b&#34;)
 *             .cidrBlock(&#34;10.0.2.0/24&#34;)
 *             .build());
 * 
 *         var barDirectory = new Directory(&#34;barDirectory&#34;, DirectoryArgs.builder()        
 *             .name(&#34;corp.notexample.com&#34;)
 *             .password(&#34;SuperSecretPassw0rd&#34;)
 *             .edition(&#34;Standard&#34;)
 *             .type(&#34;MicrosoftAD&#34;)
 *             .vpcSettings(DirectoryVpcSettings.builder()
 *                 .vpcId(main.getId())
 *                 .subnetIds(                
 *                     foo.getId(),
 *                     barSubnet.getId())
 *                 .build())
 *             .tags(Map.of(&#34;Project&#34;, &#34;foo&#34;))
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Microsoft Active Directory Connector (ADConnector)
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
 *         var main = new Vpc(&#34;main&#34;, VpcArgs.builder()        
 *             .cidrBlock(&#34;10.0.0.0/16&#34;)
 *             .build());
 * 
 *         var foo = new Subnet(&#34;foo&#34;, SubnetArgs.builder()        
 *             .vpcId(main.getId())
 *             .availabilityZone(&#34;us-west-2a&#34;)
 *             .cidrBlock(&#34;10.0.1.0/24&#34;)
 *             .build());
 * 
 *         var bar = new Subnet(&#34;bar&#34;, SubnetArgs.builder()        
 *             .vpcId(main.getId())
 *             .availabilityZone(&#34;us-west-2b&#34;)
 *             .cidrBlock(&#34;10.0.2.0/24&#34;)
 *             .build());
 * 
 *         var connector = new Directory(&#34;connector&#34;, DirectoryArgs.builder()        
 *             .name(&#34;corp.notexample.com&#34;)
 *             .password(&#34;SuperSecretPassw0rd&#34;)
 *             .size(&#34;Small&#34;)
 *             .type(&#34;ADConnector&#34;)
 *             .connectSettings(DirectoryConnectSettings.builder()
 *                 .customerDnsIps(&#34;A.B.C.D&#34;)
 *                 .customerUsername(&#34;Admin&#34;)
 *                 .subnetIds(                
 *                     foo.getId(),
 *                     bar.getId())
 *                 .vpcId(main.getId())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * DirectoryService directories can be imported using the directory `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:directoryservice/directory:Directory sample d-926724cf57
 * ```
 * 
 */
@ResourceType(type="aws:directoryservice/directory:Directory")
public class Directory extends com.pulumi.resources.CustomResource {
    /**
     * The access URL for the directory, such as `http://alias.awsapps.com`.
     * 
     */
    @Export(name="accessUrl", type=String.class, parameters={})
    private Output<String> accessUrl;

    /**
     * @return The access URL for the directory, such as `http://alias.awsapps.com`.
     * 
     */
    public Output<String> accessUrl() {
        return this.accessUrl;
    }
    /**
     * The alias for the directory (must be unique amongst all aliases in AWS). Required for `enable_sso`.
     * 
     */
    @Export(name="alias", type=String.class, parameters={})
    private Output<String> alias;

    /**
     * @return The alias for the directory (must be unique amongst all aliases in AWS). Required for `enable_sso`.
     * 
     */
    public Output<String> alias() {
        return this.alias;
    }
    /**
     * Connector related information about the directory. Fields documented below.
     * 
     */
    @Export(name="connectSettings", type=DirectoryConnectSettings.class, parameters={})
    private Output</* @Nullable */ DirectoryConnectSettings> connectSettings;

    /**
     * @return Connector related information about the directory. Fields documented below.
     * 
     */
    public Output<Optional<DirectoryConnectSettings>> connectSettings() {
        return Codegen.optional(this.connectSettings);
    }
    /**
     * A textual description for the directory.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A textual description for the directory.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * A list of IP addresses of the DNS servers for the directory or connector.
     * 
     */
    @Export(name="dnsIpAddresses", type=List.class, parameters={String.class})
    private Output<List<String>> dnsIpAddresses;

    /**
     * @return A list of IP addresses of the DNS servers for the directory or connector.
     * 
     */
    public Output<List<String>> dnsIpAddresses() {
        return this.dnsIpAddresses;
    }
    /**
     * The MicrosoftAD edition (`Standard` or `Enterprise`). Defaults to `Enterprise` (applies to MicrosoftAD type only).
     * 
     */
    @Export(name="edition", type=String.class, parameters={})
    private Output<String> edition;

    /**
     * @return The MicrosoftAD edition (`Standard` or `Enterprise`). Defaults to `Enterprise` (applies to MicrosoftAD type only).
     * 
     */
    public Output<String> edition() {
        return this.edition;
    }
    /**
     * Whether to enable single-sign on for the directory. Requires `alias`. Defaults to `false`.
     * 
     */
    @Export(name="enableSso", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableSso;

    /**
     * @return Whether to enable single-sign on for the directory. Requires `alias`. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> enableSso() {
        return Codegen.optional(this.enableSso);
    }
    /**
     * The fully qualified name for the directory, such as `corp.example.com`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The fully qualified name for the directory, such as `corp.example.com`
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The password for the directory administrator or connector user.
     * 
     */
    @Export(name="password", type=String.class, parameters={})
    private Output<String> password;

    /**
     * @return The password for the directory administrator or connector user.
     * 
     */
    public Output<String> password() {
        return this.password;
    }
    /**
     * The ID of the security group created by the directory.
     * 
     */
    @Export(name="securityGroupId", type=String.class, parameters={})
    private Output<String> securityGroupId;

    /**
     * @return The ID of the security group created by the directory.
     * 
     */
    public Output<String> securityGroupId() {
        return this.securityGroupId;
    }
    /**
     * The short name of the directory, such as `CORP`.
     * 
     */
    @Export(name="shortName", type=String.class, parameters={})
    private Output<String> shortName;

    /**
     * @return The short name of the directory, such as `CORP`.
     * 
     */
    public Output<String> shortName() {
        return this.shortName;
    }
    /**
     * The size of the directory (`Small` or `Large` are accepted values).
     * 
     */
    @Export(name="size", type=String.class, parameters={})
    private Output<String> size;

    /**
     * @return The size of the directory (`Small` or `Large` are accepted values).
     * 
     */
    public Output<String> size() {
        return this.size;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The directory type (`SimpleAD`, `ADConnector` or `MicrosoftAD` are accepted values). Defaults to `SimpleAD`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return The directory type (`SimpleAD`, `ADConnector` or `MicrosoftAD` are accepted values). Defaults to `SimpleAD`.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }
    /**
     * VPC related information about the directory. Fields documented below.
     * 
     */
    @Export(name="vpcSettings", type=DirectoryVpcSettings.class, parameters={})
    private Output</* @Nullable */ DirectoryVpcSettings> vpcSettings;

    /**
     * @return VPC related information about the directory. Fields documented below.
     * 
     */
    public Output<Optional<DirectoryVpcSettings>> vpcSettings() {
        return Codegen.optional(this.vpcSettings);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Directory(String name) {
        this(name, DirectoryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Directory(String name, DirectoryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Directory(String name, DirectoryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:directoryservice/directory:Directory", name, args == null ? DirectoryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Directory(String name, Output<String> id, @Nullable DirectoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:directoryservice/directory:Directory", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static Directory get(String name, Output<String> id, @Nullable DirectoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Directory(name, id, state, options);
    }
}
